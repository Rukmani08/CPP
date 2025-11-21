//public class ModifyCheckWellness {
//     void check(){
//         for(char ch : str.toCharArray()) {
//             if (ch == '{')
//                 stack.push(ch);
//             else if (ch == '}') {
//                 if (!stack.isEmpty())
//                     stack.pop();
//                 else {
//                     flag = false;//error
//                     break;
//                 }
//             }
//         }
//         if(!stack.isEmpty())
//             flag=false;
//     }
//    static void main() {
//        Scanner in=new Scanner(System.in);
//        System.out.println("Enter pattern to check:");
//        String str = in.next();
//        Deque<Character> stack = new ArrayDeque<>();
//        // push each char
//        boolean flag=true;
//
//         check(str);
//
//
//
//        System.out.println("Pattern "+str+" is "+flag);
//
//    }
//}
