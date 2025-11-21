import java.util.Scanner;

public class DoublyLinkedlist {


    static class DNode {
        int data;
        DNode left, right;
        DNode(int d) { data = d; this.left=this.right = null; }
    }

    DNode root;

    void insert_left(int data){
        DNode n=new DNode(data);
        if(root==null)
        {
            root=n;
            root.left=root.right=null;

        }else{

           n.right=root;
           root.left=n;
           root=n;
        }
    }

    void insert_right(int data){
        DNode n=new DNode(data);
        if(root==null)
        {
            root=n;
        }else{
            DNode t=root;    //asssign t to root
            while(t.right!=null){
                t=t.right;      ///2 move t tonext util t 's next =null
            }
             t.right=n;
            n.left=t;

        }
    }


    void delete_left(){

        if(root==null)
        {
            System.out.println("List is empty");
        }else{
            DNode t=root;
           root=root.right;
           if(root!=null)
                root.left=null;
           System.out.println("Data deleted"+t.data);

        }
    }

    void delete_right(int data)
    {
        if(root==null)//no root
            System.out.println("List is empty");
        else
        {
            DNode t,t2;
            t=root;//1
            while(t.right!=null)//2
            {
                t=t.right;
            }
            if(t==root)//single DNode
                root=null;//manual deletion
            else{
                t2=t.left;
                t2.right=null;
            }

            System.out.println("Deleted:"+t.data);//3 response message of deletion
        }
    }

    void print_list(){
        if(root==null){
            System.out.println("Linked list is null");
        }else{
            DNode t=root;
            System.out.print("|");
            while(t!=null){
                System.out.print(t.data + ("|"+ "|->|" + "|"));
                t=t.right;
            }
            System.out.println();
        }
    }



    void print_list_reverse(){
        if(root==null){
            System.out.println("Linked list is null");
        }else{
            DNode t=root;
            System.out.print("|");
            while(t.right!=null){

                t=t.right;
            }


            while(t!=null){
                System.out.println(t.data);
                t=t.left;
            }
            System.out.println();
        }
    }

    public  static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        int ch=0;
        DoublyLinkedlist  list = new  DoublyLinkedlist ();

        do {
            System.out.println("\n======== LINKED LIST MENU ========");
            System.out.println("1. Insert Left");
            System.out.println("2. Insert Right");
            System.out.println("3. Delete Left");
            System.out.println("4. Delete Right");
            System.out.println("5. Print List");
            System.out.println("6. Reverse List");
            System.out.println("0. Exit");
            System.out.println("==================================");
            System.out.print("Enter your choice: ");
            ch = sc.nextInt();
            switch (ch) {

                case 1:
                    System.out.print("Enter data to insert left: ");
                    list. insert_left(sc.nextInt());
                    break;

                case 2:
                    System.out.print("Enter data to insert right: ");
                    list.insert_right(sc.nextInt());
                    break;

                case 3:
                    list.delete_left();
                    break;

                case 4:
                    list.delete_right(sc.nextInt());
                    break;

                case 5:
                    list.print_list();
                    break;

                case 6:
                    System.out.print("reversed list are: ");
                    list.print_list_reverse();
                    break;


                case 0:
                    System.out.println("Exiting .. coded by amar.career👋");
                    return;
                default:
                    System.out.println("invalid choice. Please select from the menu.");
            }
        }while(ch!=0);


    }

}
