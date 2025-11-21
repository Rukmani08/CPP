//import java.util.ArrayDeque;
//import java.util.Queue;
//import java.util.Scanner;
//
//public class Circular_queue {
//    int front;
//    int rear;
//    int size;
//    int queue[];
//
//   int count ;
//
//    public  Circular_queue(int size)
//    {
//        this.size = size;
//        this.front = 0;
//        this.rear = -1;
//        count=0;
//        this.queue = new int[size];
//    }
//    void enqueue(int data)
//    {
//        ++count;
//        rear = (rear + 1) % size;
//        queue[rear] = data;
//    }
//    int dequeue()
//    {
//        count--;
//        int data = queue[front];
//        front = (front + 1) % size;
//        return data;
//    }
//    boolean isEmpty()
//    {
//        return count == 0;
//    }
//
//    boolean isFull()
//    {
//        return count == size;
//    }
//
//    void display()
//    {
//        int i = front;
//        int c = 0;
//        while(c != count)
//        {
//            System.out.print(queue[i]+"\t");
//            c++;
//            i = (i + 1) % size;
//        }
//
//    }
//
//    public static void main(String[] args){
//
//            Queue_impl s = new Queue_impl();
//            Scanner sc = new Scanner(System.in);
//
//            System.out.print("Enter the size of queue: ");
//            int size = sc.nextInt();
//            if (size <= 0) {
//                System.out.println("Invalid size. Exiting.");
//                sc.close();
//                return;
//            }
//            s.create_stack(size);
//
//            int choice;
//            do {
//                System.out.println("\nQueue Menu");
//                System.out.println("==========");
//                System.out.println("1. Enqueue");
//                System.out.println("2. Dequeue");
//                System.out.println("3. Print");
//                System.out.println("0. Exit");
//                System.out.println("--------");
//                System.out.print(": ");
//                choice = sc.nextInt();
//
//                switch (choice) {
//                    case 1:
//                        if (!s.is_full()) {
//                            System.out.print("Enter an ele: ");
//                            int e = sc.nextInt();
//                            s.enqueue_insert(e);
//                            System.out.println("Element added");
//                        } else {
//                            System.out.println("Queue is full");
//                        }
//                        break;
//
//                    case 2:
//                        if (!s.is_empty()) {
//                            System.out.println("Remove an ele " + s.dequque());
//                            System.out.println("Ele is popped");
//                        } else {
//                            System.out.println("Queue is empty");
//                        }
//                        break;
//
//                    case 3:
//                        if (!s.is_empty()) {
//                            System.out.println("The queue elements are:");
//                            s.print_queue();
//                        } else {
//                            System.out.println("Queue is empty");
//                        }
//                        break;
//
//                    case 0:
//                        System.out.println("Thanks for using queue");
//                        break;
//
//                    default:
//                        System.out.println("Check the option selected");
//                        break;
//                }
//            } while (choice != 0);
//
//            sc.close();
//        }
//
//
//}


//Enter the size of queue:
//3
//
//Queue Menu
//==========
//1. Enqueue
//2. Dequeue
//3. Print
//0. Exit
//--------
//: 1 20 1 30 1 40
//Enter an ele: Element added
//
//Queue Menu
//==========
//1. Enqueue
//2. Dequeue
//3. Print
//0. Exit
//--------
//: Enter an ele: Element added
//
//Queue Menu
//==========
//1. Enqueue
//2. Dequeue
//3. Print
//0. Exit
//--------
//: Enter an ele: Element added
//
//Queue Menu
//==========
//1. Enqueue
//2. Dequeue
//3. Print
//0. Exit
//--------
//: 3
//The queue elements are:
//20
//30
//40
//
//Queue Menu
//==========
//1. Enqueue
//2. Dequeue
//3. Print
//0. Exit
//--------
//: 2
//Remove an ele 20
//Ele is popped
//
//Queue Menu
//==========
//1. Enqueue
//2. Dequeue
//3. Print
//0. Exit
//--------
//: 2
//Remove an ele 30
//Ele is popped
//
//Queue Menu
//==========
//1. Enqueue
//2. Dequeue
//3. Print
//0. Exit
//--------
//: 3
//The queue elements are:
//40
//
//Queue Menu
//==========
//1. Enqueue
//2. Dequeue
//3. Print
//0. Exit
//--------
//: 0
//Thanks for using queue