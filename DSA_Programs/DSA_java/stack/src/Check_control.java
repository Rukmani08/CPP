//import java.util.ArrayDeque;
//import java.util.Deque;
//import java.util.Scanner;
//
//public class Check_control {
//    public static void main(String[] args) {
//
//        String str;
//        Scanner sc = new Scanner(System.in);
//        str = sc.next();
//        Deque<Character> st = new ArrayDeque<>();
//        boolean flag = true;
//
//        for (char ch : str.toCharArray()) {
//
//
//            if (ch == '{') {
//                st.push(ch);
//
//            } else if (ch == '}') {
//                if (!st.isEmpty()) {
//                    st.pop();
//                } else {
//                    flag = false;
//                    break;
//                }
//            }
//
//
//        }
//
//        if (!st.isEmpty()) {
//            flag = false;
//            System.out.println("the string id:-" + flag);
//        }
//    }
//}
//
//
//
//
//
