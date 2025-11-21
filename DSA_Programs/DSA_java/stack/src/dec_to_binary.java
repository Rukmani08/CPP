//import java.util.ArrayDeque;
//import java.util.ArrayList;
//import java.util.Deque;
//import java.util.concurrent.DelayQueue;
//
//public class dec_to_binary {
//
//    public static void main(String[] args)
//    {
//        Deque<Integer> st= new ArrayDeque<>() ;
//
//        int decimal=878776;
//       while(decimal>0){
//           st.push(decimal%2);
//           decimal=decimal/2;
//
//       }
//       while(!st.isEmpty()){
//           System.out.print(st.peek());
//           st.pop();
//       }
//
//
//    }
//}
//
//Output:-
 //11010110100010111000
//

//
//
//   psvm(){
//
//    int dec=34456;

//    Deque<Integer> d=new DequeArray<>();
//    while(dec>0){
//      d.push(dec%2);
//      dec=dec/2;
//
//    }
   //  ehile(!d.isEmpty()){
//     Sop(d.pop());
//
//  }
//   }
//
//
//
//
  //Bbinary to decimal
//import java.util.ArrayDeque;
//import java.util.Deque;
//
//public class dec_to_binary {
//
//    public static void main(String[] args)
//    {
//        Deque<Integer> st= new ArrayDeque<>() ;
//
//        int decimal=10111011;
//        while(decimal>0){
//            st.push(decimal%10);
//            decimal=decimal/10;
//        }
//         double ans=0;
//       while(!st.isEmpty()){
//          for(int i=st.size()-1;i>=0;i--){
//              int num=st.pop();
//              ans+=num*Math.pow(2,i);
//          }
//       }
//      System.out.println(ans);
//
//    }
//}
//
//output: 187.0
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//