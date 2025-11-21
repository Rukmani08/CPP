import java.util.*;
import java.io.*;

public class Main {

    // --- Tab class: represents a single browser tab session ---
    static class Tab {
        private final int id;
        private String current; // current URL
        private final Deque<String> backStack;   // LIFO
        private final Deque<String> forwardStack; // LIFO

        Tab(int id, String url) {
            this.id = id;
            this.current = url;
            this.backStack = new ArrayDeque<>();
            this.forwardStack = new ArrayDeque<>();
        }

        int getId() { return id; }
        String getCurrent() { return current; }

        // Visit a new URL: push current to back (if exists), set new current, clear forward
        void visit(String url) {
            if (current != null) backStack.push(current);
            current = url;
            forwardStack.clear();
        }

        // Move back: return new current or null if cannot
        String back() {
            if (backStack.isEmpty()) return null;
            forwardStack.push(current);
            current = backStack.pop();
            return current;
        }

        // Move forward: return new current or null if cannot
        String forward() {
            if (forwardStack.isEmpty()) return null;
            backStack.push(current);
            current = forwardStack.pop();
            return current;
        }
    }

    // --- Global history entry to include optional annotation like "(via Back)" ---
    static class HistoryEntry {
        final String url;
        final String note; // e.g., "via Back", "via Forward" or null

        HistoryEntry(String url, String note) {
            this.url = url;
            this.note = note;
        }

        @Override
        public String toString() {
            if (note == null || note.isEmpty()) return url;
            return url + " (" + note + ")";
        }
    }

    // --- Browser class: manages tabs and global history ---
    static class Browser {
        private final List<Tab> tabs; // simple array-backed list
        private int currentIndex; // -1 when no tab open
        private int nextTabId;
        private final Deque<HistoryEntry> globalHistory; // most recent at front

        Browser() {
            this.tabs = new ArrayList<>();
            this.currentIndex = -1;
            this.nextTabId = 1;
            this.globalHistory = new ArrayDeque<>();
        }

        // Helper: add to global history (push front), keep only last 10
        private void addGlobalHistory(String url, String note) {
            globalHistory.addFirst(new HistoryEntry(url, note));
            if (globalHistory.size() > 10) globalHistory.removeLast();
        }

        // NEW [url] : create and switch to new tab
        void newTab(String url) {
            Tab t = new Tab(nextTabId++, url);
            tabs.add(t);
            currentIndex = tabs.size() - 1;
            addGlobalHistory(url, null);
            System.out.println("[Success] Tab " + t.getId() + " created. Loading " + url + "...");
        }

        // VISIT [url] in current tab
        void visitCurrent(String url) {
            if (currentIndex == -1) {
                System.out.println("No tab open. Use NEW <url>.");
                return;
            }
            Tab cur = tabs.get(currentIndex);
            String prev = cur.getCurrent();
            cur.visit(url);
            addGlobalHistory(url, null);
            System.out.println("[Nav] Tab " + cur.getId() + ": " + (prev == null ? "null" : prev) + " -> " + url);
        }

        // BACK in current tab
        void back() {
            if (currentIndex == -1) {
                System.out.println("No tab open.");
                return;
            }
            Tab cur = tabs.get(currentIndex);
            String prev = cur.getCurrent();
            String newCurrent = cur.back();
            if (newCurrent == null) {
                System.out.println("No history to go back to.");
            } else {
                addGlobalHistory(newCurrent, "via Back");
                System.out.println("[Back] Tab " + cur.getId() + ": " + prev + " -> " + newCurrent);
            }
        }

        // FWD in current tab
        void forward() {
            if (currentIndex == -1) {
                System.out.println("No tab open.");
                return;
            }
            Tab cur = tabs.get(currentIndex);
            String prev = cur.getCurrent();
            String newCurrent = cur.forward();
            if (newCurrent == null) {
                System.out.println("No forward history to go to.");
            } else {
                addGlobalHistory(newCurrent, "via Forward");
                System.out.println("[Forward] Tab " + cur.getId() + ": " + prev + " -> " + newCurrent);
            }
        }

        // TAB [index] 1-based
        void switchTab(int index1based) {
            if (index1based < 1 || index1based > tabs.size()) {
                System.out.println("Invalid Tab ID.");
                return;
            }
            currentIndex = index1based - 1;
            Tab cur = tabs.get(currentIndex);
            System.out.println("[Switch] Now in Tab " + cur.getId() + ". Current: " + cur.getCurrent());
        }

        // CLOSE current tab, then switch appropriately
        void closeCurrent() {
            if (currentIndex == -1) {
                System.out.println("No tab to close.");
                return;
            }
            Tab removed = tabs.remove(currentIndex);
            System.out.println("[Close] Tab " + removed.getId() + " closed.");
            // Choose previous if exists else next, else no tabs left
            if (!tabs.isEmpty()) {
                if (currentIndex - 1 >= 0) {
                    currentIndex = currentIndex - 1;
                } else {
                    currentIndex = 0; // next became at same index after removal
                }
                Tab cur = tabs.get(currentIndex);
                System.out.println("[Switch] Now in Tab " + cur.getId() + ". Current: " + cur.getCurrent());
            } else {
                currentIndex = -1;
                System.out.println("No tabs left.");
            }
        }

        // Print global history (most recent first)
        void printHistory() {
            System.out.println("Global History:");
            int i = 1;
            for (HistoryEntry e : globalHistory) {
                System.out.println(i + ". " + e.toString());
                i++;
            }
            if (globalHistory.isEmpty()) {
                System.out.println("(empty)");
            }
        }
    }

    // --- Utility: clean URL argument (strip surrounding [] if user typed them) ---
    private static String cleanUrlArg(String raw) {
        if (raw == null) return null;
        raw = raw.trim();
        if (raw.startsWith("[") && raw.endsWith("]") && raw.length() >= 2) {
            return raw.substring(1, raw.length()-1).trim();
        }
        return raw;
    }

    // --- Main REPL ---
    public static void main(String[] args) throws IOException {
        Browser browser = new Browser();
        Scanner sc = new Scanner(System.in);

        System.out.println("Welcome to OmniBrowser v1.0");
        System.out.println("Type 'EXIT' to quit.");
        System.out.println();

        while (true) {
            System.out.print("OmniBrowser > ");
            String line;
            try {
                line = sc.nextLine();
            } catch (NoSuchElementException e) {
                // EOF
                break;
            }
            if (line == null) break;
            line = line.trim();
            if (line.isEmpty()) continue;

            // Split first token (command) and the rest (argument)
            String cmd;
            String arg = null;
            int firstSpace = line.indexOf(' ');
            if (firstSpace == -1) {
                cmd = line.toUpperCase();
            } else {
                cmd = line.substring(0, firstSpace).toUpperCase();
                arg = line.substring(firstSpace + 1).trim();
            }

            switch (cmd) {
                case "NEW":
                    if (arg == null || arg.isEmpty()) {
                        System.out.println("Usage: NEW [url]");
                    } else {
                        String url = cleanUrlArg(arg);
                        browser.newTab(url);
                    }
                    break;

                case "VISIT":
                    if (arg == null || arg.isEmpty()) {
                        System.out.println("Usage: VISIT [url]");
                    } else {
                        String url = cleanUrlArg(arg);
                        browser.visitCurrent(url);
                    }
                    break;

                case "BACK":
                    browser.back();
                    break;

                case "FWD":
                case "FORWARD": // accept either
                    browser.forward();
                    break;

                case "TAB":
                    if (arg == null || arg.isEmpty()) {
                        System.out.println("Usage: TAB [index]");
                    } else {
                        try {
                            int idx = Integer.parseInt(arg.trim());
                            browser.switchTab(idx);
                        } catch (NumberFormatException nfe) {
                            System.out.println("Invalid Tab ID.");
                        }
                    }
                    break;

                case "CLOSE":
                    browser.closeCurrent();
                    break;

                case "HISTORY":
                    browser.printHistory();
                    break;

                case "EXIT":
                    System.out.println("Closing OmniBrowser... Goodbye.");
                    sc.close();
                    return;

                default:
                    System.out.println("Unknown command: " + cmd);
                    System.out.println("Available: NEW, VISIT, BACK, FWD, TAB, CLOSE, HISTORY, EXIT");
                    break;
            }
        }

        sc.close();
    }
}
