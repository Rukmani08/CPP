//import java.util.Scanner;
//
//public class Implement_queue_using_linkedlst {
//    class Node{
//       int data;
//       Node next;
//       Node(int d){
//          data=d;
//          next=null;
//       }
//    }
//    Node front,rear;
//
//    void Enqueue_insert_right(int data){
//    Node newNode=new Node(data);
//     if(rear==null){
//         System.out.println("Queue is empty");
//          front= rear=newNode;
//
//
//
//
//
//     }  else{
//
//         while(rear.next!=null){
//
//
//             rear=rear.next;
//         }
//         rear.next=newNode;
//         rear=newNode;
//
//
//
//
//
//     }
//    }
//
//
//    void Delete_from_left(){
//        if(front==null){
//            System.out.println("Queue is empty");
//        }else{
//            Node temp;
//            temp=front;
//            if(front==rear){
//                front=rear=null;   //manually delete one ele.
//            }else{
//                front=front.next;
//                System.out.println("Deleted:" + temp.data);
//            }
//
//        }
//
//    }
//
//    void print_from_left_to_right(){
//        if(front==null){
//            System.out.println("Queue is empty");
//        }else{
////            for(Node i=front;i.next!=rear;i=i.next){
////                System.out.println("Enqueue data are"+i.data);
////            }
//
//            Node t=front;
//            while(t!=null){
//                System.out.println("Data are"+t.data);
//                t=t.next;
//            }
//        }
//
//     }
//
//
//    static void main(String[] args) {
//         Implement_queue_using_linkedlst obj=new Implement_queue_using_linkedlst();
//
//        int choice;
//
//        Scanner in = new Scanner(System.in);
//        do{
//            System.out.println("\nQueue Menu");
//            System.out.println("==========");
//            System.out.println("1.Enqueue");
//            System.out.println("2.Dequeue");
//            System.out.println("3.Print");
//            System.out.println("0.Exit");
//            System.out.println("--------");
//            System.out.print(":");
//            choice= in.nextInt();
//            switch (choice){
//
//                case 1:
//                    System.out.println("Enter element to enter:");
//                    int e=in.nextInt();
//                    obj.Enqueue_insert_right(e);
//                    System.out.println("Element Enqueued");
//                    break;
//                case 2:
//                    obj.Delete_from_left();
//                    break;
//                case 3:
//                    obj.print_from_left_to_right();
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
//
//}
//
//
//
//Queue Menu
//==========
//        1.Enqueue
//2.Dequeue
//3.Print
//0.Exit
//--------
//        :1 20
//Enter element to enter:
//Queue is empty
//Element Enqueued
//
//Queue Menu
//==========
//        1.Enqueue
//2.Dequeue
//3.Print
//0.Exit
//--------
//        :1 30
//Enter element to enter:
//Element Enqueued
//
//Queue Menu
//==========
//        1.Enqueue
//2.Dequeue
//3.Print
//0.Exit
//--------
//        : 1 40
//Enter element to enter:
//Element Enqueued
//
//Queue Menu
//==========
//        1.Enqueue
//2.Dequeue
//3.Print
//0.Exit
//--------
//        :3
//Data are20
//Data are30
//Data are40
//
//Queue Menu
//==========
//        1.Enqueue
//2.Dequeue
//3.Print
//0.Exit
//--------
//        :2
//
//Deleted:20
//
//Queue Menu
//==========
//        1.Enqueue
//2.Dequeue
//3.Print
//0.Exit
//--------
//        :3
//Data are30
//Data are40
//
//Queue Menu
//==========
//        1.Enqueue
//2.Dequeue
//3.Print
//0.Exit
//--------
//        :0
//Thanks for using the code: amar.career
//
