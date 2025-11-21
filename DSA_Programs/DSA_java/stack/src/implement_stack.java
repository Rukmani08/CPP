
import java.util.Scanner;

public class implement_stack
{
    int stack[];
    int tos,MaxSize;
    void create_Stack(int size)
    {
        tos=-1;
        MaxSize=size;
        stack=new int[MaxSize];
    }
    //push:accepts an element on stack
    //tos+1
    void push(int e)
    {
        tos++;
        stack[tos]=e;
        //stack[++tos]=e;
    }
    boolean is_full()
    {
        if(tos==MaxSize-1)
            return true;
        else
            return false;


        //return(tos==MaxSize-1);

    }
    int pop()
    {
        int temp=stack[tos];
        tos--;
        return(temp);
        //return(stack[tos--]);
    }
    boolean is_empty()
    {
        if(tos==-1)
            return true;
        else
            return false;

        //return(tos==-1);

    }
    void print_stack()//in LIFO
    {
        for(int i=tos;i>=0;i--)
            System.out.println(stack[i]);
    }

    int peek()//only return element on top
    {
        return(stack[tos]);
    }

    public static void main(String[] args)
    {
        implement_stack obj=new implement_stack();
        int choice;
        Scanner in=new Scanner(System.in);
        System.out.println("Enter size of stack:");
        int size=in.nextInt();
        obj.create_Stack(size);
        do
        {
            System.out.println("\nStack Menu");
            System.out.println("==========");
            System.out.println("1.Push");
            System.out.println("2.Pop");
            System.out.println("3.Peek");
            System.out.println("4.Print");
            System.out.println("0.Exit");
            System.out.println("--------");
            System.out.print(":");
            choice=in.nextInt();
            switch(choice)
            {
                case 1:
                    if(!obj.is_full())//if not full then
                    {
                        System.out.println("Enter element to push:");
                        int e=in.nextInt();
                        obj.push(e);
                        System.out.println("Element pushed");
                    }
                    else
                    {
                        System.out.println("Stack Full");
                    }
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
                        System.out.println("Element @ Peek is:"+obj.peek());
                    }
                    else
                    {
                        System.out.println("Stack Empty");
                    }
                    break;
                case 4:
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
        }while(choice!=0);
    }
}
