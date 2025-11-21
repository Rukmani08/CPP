//
//
//
//import java.util.Scanner;
////Enqueue dequue print exit
//public class Priority_queue  {
//    int queue[];
//    int front,rear,maxSize;
//    //creating an stack
//    void create_stack(int size){
//        front=0;
//        rear=-1;
//        maxSize=size;
//        queue= new int[maxSize];
//    }
//
//    //accepts  an element on queue
//    void enqueue_insert(int e){
//
//       //queue code bubble sort
//
//        queue[++rear]=e;
//        for(int i=front ;i<rear;i++){
//            for(int j=front;j<rear;j++){
//                if(queue[j]<queue[j+1]){
//                    int temp=queue[j];
//                    queue[j]=queue[j+1];
//                    queue[j+1]=temp;
//                }
//            }
//        }
//
//
//
//    }
//    //checking if stack is full or not
//    boolean is_full(){
//
//
//        return (rear==maxSize-1);
//    }
//
//    //implementing pop()
//
//    int dequque(){
//        int temp=queue[front];
//
//        front++;
//        return temp;
//
//
//    }
//
//    void print_queue(){
//        for(int i=front;i<=rear;i++){
//            System.out.println(queue[i]);
//        }
//    }
//
//    //check if stack is empty
//
//    boolean is_empty(){
//        if(front>rear){
//            return true;
//        }else{
//            return false;
//        }
//        //return (front>rear);
//    }
//
//
//    public static void main(String[] args) {
//        Priority_queue s = new Priority_queue();
//        Scanner sc = new Scanner(System.in);
//
//        System.out.print("Enter the size of queue: ");
//        int size = sc.nextInt();
//        if (size <= 0) {
//            System.out.println("Invalid size. Exiting.");
//            sc.close();
//            return;
//        }
//        s.create_stack(size);
//
//        int choice;
//        do {
//            System.out.println("\nPriority Queue Menu");
//            System.out.println("===================");
//            System.out.println("1. Enqueue");
//            System.out.println("2. Dequeue");
//            System.out.println("3. Print");
//            System.out.println("0. Exit");
//            System.out.println("-------------------");
//            System.out.print(": ");
//            choice = sc.nextInt();
//
//            switch (choice) {
//                case 1:
//                    if (!s.is_full()) {
//                        System.out.print("Enter an element: ");
//                        int e = sc.nextInt();
//                        s.enqueue_insert(e);
//                        System.out.println("Element added");
//                    } else {
//                        System.out.println("Queue is full");
//                    }
//                    break;
//
//                case 2:
//                    if (!s.is_empty()) {
//                        System.out.println("Removed element: " + s.dequque());
//                    } else {
//                        System.out.println("Queue is empty");
//                    }
//                    break;
//
//                case 3:
//                    if (!s.is_empty()) {
//                        System.out.println("Queue elements (high priority first):");
//                        s.print_queue();
//                    } else {
//                        System.out.println("Queue is empty");
//                    }
//                    break;
//
//                case 0:
//                    System.out.println("Thanks for using priority queue");
//                    break;
//
//                default:
//                    System.out.println("Check the option selected");
//                    break;
//            }
//        } while (choice != 0);
//
//        sc.close();
//    }
//
//}
//
//        Enter the size of queue: 3
//
//        Priority Queue Menu
//===================
//        1. Enqueue
//2. Dequeue
//3. Print
//0. Exit
//-------------------
//        : 1
//        Enter an element: 20
//        Element added
//
//        Priority Queue Menu
//===================
//        1. Enqueue
//2. Dequeue
//3. Print
//0. Exit
//-------------------
//        : 1 30 1 40
//        Enter an element: Element added
//
//        Priority Queue Menu
//===================
//        1. Enqueue
//2. Dequeue
//3. Print
//0. Exit
//-------------------
//        : Enter an element: Element added
//
//        Priority Queue Menu
//===================
//        1. Enqueue
//2. Dequeue
//3. Print
//0. Exit
//-------------------
//        : 3
//        Queue elements (high priority first):
//        40
//        30
//        20
//
//        Priority Queue Menu
//===================
//        1. Enqueue
//2. Dequeue
//3. Print
//0. Exit
//-------------------
//        : 2
//        Removed element: 40
//
//        Priority Queue Menu
//===================
//        1. Enqueue
//2. Dequeue
//3. Print
//0. Exit
//-------------------
//        : 3
//        Queue elements (high priority first):
//        30
//        20
//
//        Priority Queue Menu
//===================
//        1. Enqueue
//2. Dequeue
//3. Print
//0. Exit
//-------------------
//        : 0
//        Thanks for using priority queue
//



