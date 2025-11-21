import java.util.Scanner;

//public class Two_queue_in_an_array {
//}
//
////public class Queue_impl {
////}
////
////
//import java.util.Scanner;

public class Two_queue_in_an_array  {
    int queue[];
    int front1,rear1,front2,rear2,maxSize;
    //creating an stack
    void create_stack(int size){
        front1=0;
        rear1=-1;
        front2=maxSize-1;
        rear2=maxSize;
        maxSize=size;
        queue= new int[maxSize];
    }

    //accepts  an element on queue
    void enqueue_insert1(int e){
        queue[++rear1]=e;
    }
    void enqueue_insert2(int e){
        queue[--rear2]=e;
    }
    //checking if stack is full or not
    boolean is_full(){


        return (rear1==(rear2-1));
    }

    //implementing pop()

    int dequque1(){
        int temp=queue[front1];

        front1++;
        return temp;


    }
    int dequque2(){
        int temp=queue[front2];

        front2--;
        return (temp);


    }

    void print_queue1(){
        for(int i=front1;i<=rear1;i++){
            System.out.println(queue[i]);
        }
    }
    void print_queue2(){
        for(int i=front2;i>=rear2;i--){
            System.out.println(queue[i]);
        }
    }

    //check if stack is empty

    boolean is_empty1(){
        if(front1>rear1){
            return true;
        }else{
            return false;
        }
        //return (front>rear);
    }
    boolean is_empty2(){
        if(front2<rear2){
            return true;
        }else{
            return false;
        }
        //return (front>rear);
    }


    public static void main(String[] args) {
        Two_queue_in_an_array  s= new Two_queue_in_an_array ();
        int choice;
        Scanner sc=new Scanner(System.in);
        int size=sc.nextInt();


        System.out.println("\nStack Menu");
        System.out.println("==========");
        System.out.println("1.Push");
        System.out.println("2.Pop");

        System.out.println("4.Print");
        System.out.println("0.Exit");
        System.out.println("--------");
        System.out.print(":");
        choice=sc.nextInt();

//        switch (choice){
//            case 1:
//                if(!s.is_full()){
//                    System.out.println("Enter an ele");
//                    int e= sc.nextInt();
//                    s.enqueue_insert(e);
//                    System.out.println("Element added");
//                }else{
//
//                    System.out.println("stack is full");
//                }
//                break;
//
//
//            case 2:
//                if(!s.is_empty()){
//                    System.out.println("Remove an ele"+s.dequque());
//                    System.out.println("Ele is popped");
//
//                }else{
//                    System.out.println("Queue is empty");
//                }
//                break;
//
//
//            case 3:
//                if(!s.is_empty()){
//                    System.out.println("the stack ele are:");
//                    s.print_queue();
//                }else{
//                    System.out.println("stack is emmpty");
//                }
//
//                break;
//
//            case 0:
//                System.out.println("Thsnks for using stack");
//                break;
//
//            default:
//                System.out.println("Check the option selected");
//                break;
//
//        }while(choice!=0);

    }
}
