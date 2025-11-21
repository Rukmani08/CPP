import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;
import java.util.Iterator;

public class Main {

    Deque<Integer> st1 = new ArrayDeque<>();
    Deque<Integer> st2 = new ArrayDeque<>();

    // enqueue
    void push(int e) {
        st1.push(e);
    }

    // dequeue (correct two-stack algorithm)
    int pop() {
        // if st2 empty, move all items from st1 to st2
        if (st2.isEmpty()) {
            while (!st1.isEmpty()) {
                st2.push(st1.pop());
            }
        }
        // now pop from st2 (FIFO)
        if (st2.isEmpty()) {
            throw new IllegalStateException("Queue is empty");
        }
        return st2.pop();
    }

    boolean is_empty() {
        return st2.isEmpty() && st1.isEmpty();
    }

    // print queue in FIFO order (front -> rear)
    // print queue in FIFO order (front -> rear)
    void print_stack() {
        if (is_empty()) {
            System.out.println("[]");
            return;
        }

        StringBuilder sb = new StringBuilder();
        sb.append("[");

        boolean first = true;

        // st2 contains front elements in correct order (top -> bottom)
        for (Integer v : st2) {
            if (!first) sb.append(", ");
            sb.append(v);
            first = false;
        }

        // st1 has newest elements on top; for FIFO we need to print its bottom->top
        for (Iterator<Integer> it = st1.descendingIterator(); it.hasNext(); ) {
            Integer v = it.next();
            if (!first) sb.append(", ");
            sb.append(v);
            first = false;
        }

        sb.append("]");
        System.out.println(sb.toString());
    }


    public static void main(String[] args) {

        Main obj = new Main();
        int choice;
        Scanner in = new Scanner(System.in);
        System.out.println("Enter size of stack:");
        int size = in.nextInt();

        do {
            System.out.println("\nStack Menu");
            System.out.println("==========");
            System.out.println("1.Push");
            System.out.println("2.Pop");
            System.out.println("3.Print");
            System.out.println("0.Exit");
            System.out.println("--------");
            System.out.print(":");
            choice = in.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("Enter element to push:");
                    int e = in.nextInt();
                    obj.push(e);
                    System.out.println("Element pushed");
                    break;
                case 2:
                    if (!obj.is_empty()) {
                        System.out.println("Element poped:" + obj.pop());
                    } else {
                        System.out.println("Stack Empty");
                    }
                    break;
                case 3:
                    if (!obj.is_empty()) {
                        System.out.println("Stack has:");
                        obj.print_stack();
                    } else {
                        System.out.println("Stack Empty");
                    }
                    break;
                case 0:
                    System.out.println("Thanks for using the code: amar.career");
                    break;
                default:
                    System.out.println("check the option selected.");
                    break;
            }
        } while (choice != 0);
    }
}
