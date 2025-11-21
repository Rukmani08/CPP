//import java.util.Scanner;
//
//public class Implemt_stackusing_linkedlst {
//    class Node{
//       int data;
//
//       Node next;
//       Node(int d){
//           data=d;
//           next=null;
//       }
//
//    }
//
//    Node tos;
//    void push(int data) {
//        Node n = new Node(data);//created node
//        if (tos == null)//no root
//            tos = n;//1st becomes root
//        else {
//            n.next = tos;//1
//            tos = n;//2
//        }
//    }
//
//    void pop(){
//        if(tos==null){
//            System.out.println("stack is empty");
//        } else{
//            Node t=tos;
//            tos=tos.next;
//            System.out.println("Ele popped");
//        }
//    }
//
//    void print_stack(){
//        if(tos==null){
//            System.out.println("Stack is empty");
//        }else{
//            Node t = tos;
//            while(t!=null){
//                System.out.println(t.data);
//                t=t.next;
//            }
//
//
//        }
//    }
//
//    void peek(){
//       if(tos==null){
//           System.out.println("Stack is empty");
//       }else{
//           System.out.println(tos.data);
//       }
//    }
//
//    static void main(String[] args) {
//        Implemt_stackusing_linkedlst obj=new  Implemt_stackusing_linkedlst();
//        int choice;
//        Scanner in=new Scanner(System.in);
//
//        do
//        {
//            System.out.println("\nStack Menu");
//            System.out.println("==========");
//            System.out.println("1.Push");
//            System.out.println("2.Pop");
//            System.out.println("3.Peek");
//            System.out.println("4.Print");
//            System.out.println("0.Exit");
//            System.out.println("--------");
//            System.out.print(":");
//            choice=in.nextInt();
//            switch(choice)
//            {
//                case 1:
//                   //if not full then
//
//                        System.out.println("Enter element to push:");
//                        int e=in.nextInt();
//                        obj.push(e);
//                        System.out.println("Element pushed");
//
//
//                    break;
//                case 2:
//
//                       obj.pop();
//
//
//
//
//                    break;
//                case 3:
//
//                       obj.peek();
//
//
//                    break;
//                case 4:
//
//                        System.out.println("Stack has:");
//                        obj.print_stack();
//
//
//                    break;
//                case 0:
//                    System.out.println("Thanks for using the code: amar.career");
//                    break;
//                default:
//                    System.out.println("check the option selected.");
//                    break;
//
//            }
//        }while(choice!=0);
//    }
//}
//
//
//
//Stack Menu
//==========
//        1.Push
//2.Pop
//3.Peek
//4.Print
//0.Exit
//--------
//        :1
//Enter element to push:
//        20
//Element pushed
//
//Stack Menu
//==========
//        1.Push
//2.Pop
//3.Peek
//4.Print
//0.Exit
//--------
//        :1 30
//Enter element to push:
//Element pushed
//
//Stack Menu
//==========
//        1.Push
//2.Pop
//3.Peek
//4.Print
//0.Exit
//--------
//        :1 40
//Enter element to push:
//Element pushed
//
//Stack Menu
//==========
//        1.Push
//2.Pop
//3.Peek
//4.Print
//0.Exit
//--------
//        :4
//Stack has:
//        40
//        30
//        20
//
//Stack Menu
//==========
//        1.Push
//2.Pop
//3.Peek
//4.Print
//0.Exit
//--------
//        :2
//Ele popped
//
//Stack Menu
//==========
//        1.Push
//2.Pop
//3.Peek
//4.Print
//0.Exit
//--------
//        :4
//
//Stack has:
//        30
//        20
//
//Stack Menu
//==========
//        1.Push
//2.Pop
//3.Peek
//4.Print
//0.Exit
//--------
//        :3
//        30
//
//Stack Menu
//==========
//        1.Push
//2.Pop
//3.Peek
//4.Print
//0.Exit
//--------
//        :0
//Thanks for using the code: amar.career
//
