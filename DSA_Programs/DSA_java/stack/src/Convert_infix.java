import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;



public class Convert_infix {


    static int precedence(char str) {
        if (str == '+' || str == '-') {
            return 1;
        } else if (str == '*' || str == '/') {
            return 2;
        } else if (str == '^') {
            return 3;
        }
        return -1;
    }

    static String Convert_infixto_postfix(String s) {
       String postfix = "";
        Deque<Character> st = new ArrayDeque<>();
        for (char ch : s.toCharArray()) {
            if (Character.isLetterOrDigit(ch))
                postfix += ch;
            else if (ch == '(')
                st.push(ch);
            else if (ch == ')') {
                while (!st.isEmpty() && st.peek() != '(')
                    postfix += st.pop();
                st.pop();
            } else {
                while (!st.isEmpty() && precedence(ch) <= precedence(st.peek()))
                    postfix += st.pop();
                st.push(ch);


            }
        }
        while (!st.isEmpty())
            postfix += st.pop();

        return postfix;
    }

  public static void main(String[] args) {
        String s;

        Scanner sc = new Scanner(System.in);
        s = sc.next();
        String ans = Convert_infixto_postfix(s);
        System.out.println(ans);


    }

}




