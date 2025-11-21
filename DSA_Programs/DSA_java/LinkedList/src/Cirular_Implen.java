import java.util.Scanner;

public class Cirular_Implen {



    static class Node {
        int data;
        Node next;
        Node(int d) { data = d; next = null; }
    }

    Node root,last;

    void insert_left(int data){
        Node n=new Node(data);
        if(root==null)
        {
            root=last=n;
             last.next=root;
        }else{
            Node t=root;

            n.next = root;     // new node points to old root
            root = n;          // update root
            last.next = root;


        }
    }

    void insert_right(int data){
        Node n=new Node(data);
        if(root==null)
        {
            root=last=n;
            last.next=root;
        }else{
          last.next=n;
          last=n;
          last.next=root;


        }
    }


    void delete_left() {
        Node t = root;
        if (root == null) {
            System.out.println("List is empty");
        } else {
            if (root == last) {
                root = last = null;
            } else {
                //1st
                root = root.next;  ////2nd
                last.next = root;
            }
            System.out.println("Deleted:" + t.data);

        }
    }

    void delete_right(int data)
    {
        if(root==null)//no root
            System.out.println("List is empty");
        else
        {
            Node t,t2;
            t=t2=root;//1

            if(root==last)//single node
                root = last = null;//manual deletion
            else {

                while(t2.next!=last)//2
                {   t2=t;
                    t=t.next;
                }
                last=t2;
                t2.next=root;

            }
            System.out.println("Deleted:"+t.data);//3 response message of deletion
        }
    }

    void print_list(){
        if(root==null){
            System.out.println("Linked list is null");
        }else{
            Node t=root;
            System.out.print("|");

            do{
                System.out.print(t.data + (t.next!=null ? "|->|" : "|"));
                t=t.next;
            }while(t!=root);
//            while(t.next!=root){
//                System.out.print(t.data + (t.next!=null ? "|->|" : "|"));
//                t=t.next;
//            }
            System.out.println();
        }
    }

    void search_list(int key){
        if(root==null){
            System.out.println("Linked list is null");
        }else{
            Node t=root;

            while(t!=null){
                if(t.data==key){
                    System.out.println("Data found");
                    return;
                }
                // optional: don't print every element, but kept your original behavior
                System.out.println(t.data);
                t=t.next;
            }

            System.out.println("not found");

        }
    }

    void Delete_element(int key){
        if(root==null){
            System.out.println("Liknked list is null");
            return;
        }else{
            Node t, t2;
            t = root;
            t2 = null;          // previous starts null

            while(t!=null){
                if(t.data==key){  //data found
                    break;
                }
                t2=t;
                t=t.next;
            }
            if(t==null){
                System.out.println("Not found");
            }else{
                if(t==root) {
                    root = root.next;
                } else if(t.next==null){
                    // t is last node
                    t2.next=null;
                }else{
                    // middle node
                    t2.next=t.next;
                }
                System.out.println("Deleted " + key);
            }
        }
    }

    // insert 'data' after first occurrence of 'key'
    void insert_key(int key,int data){
        if(root==null){
            System.out.println("Empty");
        }else{
            Node t;
            t=root;
            while(t!=null){
                if(t.data==key)
                    break;
                t=t.next;
            }

            if(t==null)
                System.out.println("\n" + key + " Not found");
            else{
                System.out.println("\n" + key + " found");
                Node n=new Node(data);

                n.next=t.next;
                t.next=n;
                System.out.println(data + " inserted after " + key);
            }
        }
    }

    void Sort_list(){
        if(root==null)
            System.out.println("Empty List");
        else{
            Node t1,t2;
            for(Node i=root;i.next!=null;i=i.next){
                for(t1=root,t2=t1.next;t2!=null;t1=t1.next,t2=t2.next){
                    if(t1.data>t2.data)
                    {
                        int temp=t1.data;
                        t1.data=t2.data;
                        t2.data=temp;
                    }

                }
            }

        }
        System.out.println("List sorted");

    }

    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        int ch=0;
        Cirular_Implen list = new Cirular_Implen();

        do {
            System.out.println("\n======== LINKED LIST MENU ========");
            System.out.println("1. Insert Left");
            System.out.println("2. Insert Right");
            System.out.println("3. Delete Left");
            System.out.println("4. Delete Right");
            System.out.println("5. Print List");
            System.out.println("6. Search Element");
            System.out.println("7. Delete Element");
            System.out.println("8. Insert After");
            System.out.println("9. Sort List");
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
                    System.out.print("Enter element to search: ");
                    list.search_list(sc.nextInt());
                    break;

                case 7:
                    System.out.print("Enter element to delete: ");
                    list.Delete_element(sc.nextInt());
                    break;

                case 8:
                    System.out.print("Enter key after which to insert: ");
                    int key = sc.nextInt();
                    System.out.print("Enter data to insert: ");
                    int data = sc.nextInt();
                    list.insert_key(key, data);
                    break;

                case 9:
                    list.Sort_list();
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




