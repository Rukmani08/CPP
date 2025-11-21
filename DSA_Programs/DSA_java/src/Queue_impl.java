//public class Queue_impl {
//}
//
//
import java.util.Scanner;

public class Queue_impl  {
     int queue[];
     int front,rear,maxSize;
     //creating an stack
     void create_stack(int size){
         front=0;
         rear=-1;
         maxSize=size;
         queue= new int[maxSize];
     }

     //accepts  an element on queue
    void enqueue_insert(int e){
        queue[++rear]=e;
    }
    //checking if stack is full or not
    boolean is_full(){


         return (rear==maxSize-1);
    }

    //implementing pop()

    int dequque(){
         int temp=queue[front];

       front++;
       return temp;


    }

      void print_queue(){
         for(int i=front;i<=rear;i++){
             System.out.println(queue[i]);
         }
    }

    //check if stack is empty

    boolean is_empty(){
       if(front>rear){
           return true;
       }else{
           return false;
       }
         //return (front>rear);
    }


   public static void main(String[] args) {
        Queue_impl  s= new Queue_impl ();
         int choice;
         Scanner sc=new Scanner(System.in);
         System.out.println("Enter the size of quque");
         int size=sc.nextInt();
         s.create_stack(size);

      do {
          System.out.println("\nStack Menu");
          System.out.println("==========");
          System.out.println("1.Enqueue");
          System.out.println("2.Dequeue");

          System.out.println("3.Print");
          System.out.println("0.Exit");
          System.out.println("--------");
          System.out.print(":");
          choice = sc.nextInt();


          switch (choice) {
              case 1:
                  if (!s.is_full()) {
                      System.out.println("Enter an ele");
                      int e = sc.nextInt();
                      s.enqueue_insert(e);
                      System.out.println("Element added");
                  } else {

                      System.out.println("stack is full");
                  }
                  break;


              case 2:
                  if (!s.is_empty()) {
                      System.out.println("Remove an ele" + s.dequque());
                      System.out.println("Ele is popped");

                  } else {
                      System.out.println("Queue is empty");
                  }
                  break;


              case 3:
                  if (!s.is_empty()) {
                      System.out.println("the stack ele are:");
                      s.print_queue();
                  } else {
                      System.out.println("stack is empty");
                  }

                  break;

              case 0:
                  System.out.println("Thsnks for using stack");
                  break;

              default:
                  System.out.println("Check the option selected");
                  break;
          }

          }
          while (choice != 0) ;
          sc.close();
      }
    }

