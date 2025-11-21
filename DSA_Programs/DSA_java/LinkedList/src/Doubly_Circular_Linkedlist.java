import java.util.Scanner;

public class Doubly_Circular_Linkedlist {
    class DCNode{
        int data;
        DCNode left;
        DCNode right;
        DCNode(int data){
            this.data=data;
            this.left=this.right=null;
        }
    }
    DCNode root,last;

//Insert left, insert right, delete left, delete right, print normal, print reverse.
//Along with menu-driven
    void insert_left(int data){
        DCNode n=new DCNode(data);
        if(root==null){
           root=last=n;
           n.left = n.right = n;
        }else{
            n.right=root;
            n.left=last;
            root.left = n;
            last.right = n;
            root=n;
        }
       System.out.println("Data inserted"+data);
    }
    void insert_right(int data){
        DCNode n=new DCNode(data);
        if(root==null){
           root=last=n;
           n.left = n.right = n;
        }else{
           n.left=last;
            n.right = root;
            last.right = n;
            root.left = n;
           last=n;


        }
        System.out.println("Data inserted " + data);
    }
    void delete_left(){
        if(root==null){
            System.out.println("No list");
        }else if(root==last){
            System.out.println("Deleted: " + root.data);
            root = last = null;
        }else{
            root = root.right;
            root.left = last;
            last.right = root;
            System.out.println("Deleted: " + root.data);
        }
    }


    void delete_right(){
        if(root==null){
            System.out.println("No list");
        }else if(root==last){
            root = last = null;
        }else{
            last = last.left;
            last.right = root;
            root.left = last;
        }
    }

    void print_DList(){
        if(root==null){
            System.out.println("No ele");
        }else{
            DCNode t =root;
           do{
               System.out.println("Data:"+t.data);
               t=t.right;
           } while(t!=root);


        }
    }
    void print_rev(){
        if(root==null){
            System.out.println("No ele");
        }else{
            DCNode t= last;
            do {
                System.out.println("Data: " + t.data);
                t = t.left;
            } while(t != last);

        }
    }

    public  static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        int ch=0;
        Doubly_Circular_Linkedlist  list = new Doubly_Circular_Linkedlist ();

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
                    list.insert_left(sc.nextInt());
                    break;

                case 2:
                    System.out.print("Enter data to insert right: ");
                    list.insert_right(sc.nextInt());
                    break;

                case 3:
                    list.delete_left();
                    break;

                case 4:
                    list.delete_right();
                    break;

                case 5:
                    list.print_DList();
                    break;

                case 6:
                    System.out.print("reversed list are: ");
                    list.print_rev();
                    break;


                case 0:
                    System.out.println("Exiting ..");
                    return;

                default:
                    System.out.println("invalid choice. Please select from the menu.");
            }
        }while(ch!=0);


    }


}
