//implement Queue using stack

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

public class implement_Queueusing_stack {

    Deque<Integer> st1 =new ArrayDeque<>();
    Deque<Integer> st2 =new ArrayDeque<>();

    void push(int e)
    {
        st1.push(e);
    }

    int pop()
    {
        int len = st1.size();
        for (int i = 0; i<len; i++)
        {
            st2.push(st1.pop());
        }
//        int temp = st1.pop();
//        len = st2.size();
//        for (int i = 0; i<len; i++)
//        {
//            st1.push(st2.pop());
//        }
//
//        return temp;
        return st2.pop();

    }
    boolean is_empty()
    {

        return st2.isEmpty()&&st1.isEmpty();

    }
    void print_stack()//in LIFO
    {

        System.out.println(st2);
    }


    public static void main(String[] args) {

        implement_Queueusing_stack obj=new implement_Queueusing_stack();
        int choice;
        Scanner in=new Scanner(System.in);
        System.out.println("Enter size of stack:");
        int size=in.nextInt();

        do
        {
            System.out.println("\nStack Menu");
            System.out.println("==========");
            System.out.println("1.Push");
            System.out.println("2.Pop");
            System.out.println("3.Print");
            System.out.println("0.Exit");
            System.out.println("--------");
            System.out.print(":");
            choice=in.nextInt();
            switch(choice)
            {
                case 1:
                    System.out.println("Enter element to push:");
                    int e=in.nextInt();
                    obj.push(e);
                    System.out.println("Element pushed");

                    break;
                case 2:
                    if(!obj.is_empty())//if not empty then
                    {
                        System.out.println("Element poped:"+obj.pop());
                    }
                    else
                    {
                        System.out.println("Stack Empty");
                    }
                    break;

                case 3:
                    if(!obj.is_empty())//if not empty then
                    {
                        System.out.println("Stack has:");
                        obj.print_stack();
                    }
                    else
                    {
                        System.out.println("Stack Empty");
                    }
                    break;
                case 0:
                    System.out.println("Thanks for using the code: amar.career");
                    break;
                default:
                    System.out.println("check the option selected.");
                    break;

            }
        }
        while(choice!=0);
    }



}



//
////Implement stack using queue
//
//import java.util.ArrayDeque;
//import java.util.Deque;
//import java.util.Scanner;
//
//
//public class implement_stack_using_queue {
//
//    //Queue<Integer>queue =new ArrayDeque<>();
//    Deque<Integer>stack = new ArrayDeque<>();
//    void enqueue(int e)
//    {
//        stack.add(e);
//
//    }
//
//    int  dequeue()
//    {
//        if(stack.isEmpty())
//        {
//            System.out.println("Queue Empty");
//        }
//        for(int i = 0; i<stack.size()-1; i++)
//            stack.add(stack.poll());
//        return stack.poll();
//    }
//
//    boolean is_empty()
//    {
//        return(stack.isEmpty());
//    }
//    void print_queue()
//    {
//
//        System.out.print(stack);
//    }
//
//    public static void main(String[] args)
//    {
//        implement_stack_using_queue obj=new implement_stack_using_queue();
//        int choice;
//        Scanner in=new Scanner(System.in);
//        System.out.println("Enter size of Queue:");
//        int size=in.nextInt();
//        do
//        {
//            System.out.println("\nQueue Menu");
//            System.out.println("==========");
//            System.out.println("1.enqueue");
//            System.out.println("2.dequeue");
//            System.out.println("3.Print");
//            System.out.println("0.Exit");
//            System.out.println("--------");
//            System.out.print(":");
//            choice=in.nextInt();
//            switch(choice)
//            {
//                case 1:
//
//                    System.out.println("Enter element to enqueue:");
//                    int e=in.nextInt();
//                    obj.enqueue(e);
//                    System.out.println("Element pushed");
//
//                    break;
//
//                case 2:
//                    if(!obj.is_empty())//if not empty then
//                    {
//                        System.out.println("Element dequeue:"+obj.dequeue());
//                    }
//                    else
//                    {
//                        System.out.println("Queue Empty");
//                    }
//                    break;
//                case 3:
//                    if(!obj.is_empty())//if not empty then
//                    {
//                        System.out.println("Queue has:");
//                        obj.print_queue();
//                    }
//                    else
//                    {
//                        System.out.println("Queue Empty");
//                    }
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
//
//
//    }
//
//
//}
