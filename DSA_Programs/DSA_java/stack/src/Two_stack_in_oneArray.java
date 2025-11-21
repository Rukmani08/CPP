public class Two_stack_in_oneArray {
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
}
