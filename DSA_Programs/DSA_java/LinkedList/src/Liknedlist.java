//import java.util.Scanner;
//
//public class Liknedlist {
//
//    static class Node {
//        int data;
//        Node next;
//        Node(int d) { data = d; next = null; }
//    }
//
//    Node root;
//
//    void insert_left(int data){
//        Node n=new Node(data);
//        if(root==null)
//        {
//            root=n;
//        }else{
//            n.next=root;  //1st
//            root=n;  //2nd
//        }
//    }
//
//    void insert_right(int data){
//        Node n=new Node(data);
//        if(root==null)
//        {
//            root=n;
//        }else{
//           Node t=root;    //asssign t to root
//           while(t.next!=null){
//               t=t.next;       ///2 move t tonext util t 's next =null
//           }
//           t.next=n;    //3connected
//
//        }
//    }
//
//
//    void delete_left(){
//
//        if(root==null)
//        {
//            System.out.println("List is empty");
//        }else{
//           Node t=root;  //1st
//            root=root.next;  ////2nd
//            System.out.println("Deleted:"+t.data);
//        }
//    }
//
//    void delete_right(int data)
//    {
//        if(root==null)//no root
//            System.out.println("List is empty");
//        else
//        {
//            Node t,t2;
//            t=t2=root;//1
//            while(t.next!=null)//2
//            {t2=t;
//                t=t.next;
//            }
//            if(t==root)//single node
//                root=null;//manual deletion
//            else
//                t2.next=null;//break the link
//            System.out.println("Deleted:"+t.data);//3 response message of deletion
//        }
//    }
//
//
//
//
//
//    void print_list(){
//        if(root==null){
//            System.out.println("Linked list is null");
//        }else{
//            Node t=root;
//            while(t!=null){
//                System.out.println("|"+t.data+"|->");
//                t=t.next;
//            }
//        }
//    }
//
//
//
//
//
//    void search_list(int key){
//        if(root==null){
//            System.out.println("Linked list is null");
//        }else{
//            Node t=root;
//
//
//            while(t!=null){
//                if(t.data==key){
//                    System.out.println("Data found");
//                    return;
//                }
//                System.out.println(t.data);
//                t=t.next;
//            }
//
//                System.out.println("not found");
//
//        }
//    }
//
//
//
//    void Delete_element(int key){
//        if(root==null){
//            System.out.println("Liknked list is null");
//            return;
//        }else{
//            Node t,t2;
//             t=t2=root;
//
//
//            while(t!=null){
//                if(t.data==key){  //data found
//
//                    break;
//
//
//                }
//                t2=t;
//                t=t.next;
//            }
//            if(t==null){
//              System.out.println("Not found");
//            }else{
//                if(t==root) {
//                    root = root.next;
//                } else if(t.next==null){
//                    t2.next=null;
//                    }else{
//                    t2.next=t.next;
//                    }
//                System.out.println("Deleted " + key);
//                }
//            }
//
//
//
//        }
//
//        //we ll search for the key ele if found
//    //we'll create a new node with given data and insert taht key
//        void insert_key(int key,int data){
//           if(root==null){
//
//               System.out.println("Empty");
//
//           }else{
//               Node t;
//               t=root;
//               while(t!=null){
//                   if(t.data==data)
//                       break;
//                   t=t.next;
//               }
//
//               if(t==null)
//                   System.out.println("\n+"+key+"Not found");
//               else{
//                   System.out.println("\n+"+key+" found");
//                   Node n=new Node(data);
//
//                   n.next=t.next;
//                   t.next=n;
//                   System.out.println(data+"Deleted");
//               }
//           }
//        }
//
//
//        void Sort_list(){
//          if(root==null)
//              System.out.println("Empty List");
//          else{
//               Node t1,t2;
//              for(Node i=root;i.next!=null;i=i.next){
//                  for(t1=root,t2=t1.next;t2!=null;t1=t1.next,t2=t2.next){
//                      if(t1.data>t2.data)
//                      {
//                          int temp=t1.data;
//                          t1.data=t2.data;
//                          t2.data=temp;
//                      }
//
//                  }
//              }
//
//
//
//          }
//
//        }
//
//    public static void main(String[] args) {
//        Liknedlist obj=new Liknedlist();
//        Scanner in = new Scanner(System.in);
//        int choice;
//
//
//        do{
//            System.out.println("\nQueue Menu");
//            System.out.println("==========");
//            System.out.println("1.Enqueue");
//            System.out.println("2.Dequeue");
//            System.out.println("3.Print");
//            System.out.println("0.Exit");
//            System.out.println("--------");
//            System.out.print(":");
//            choice= in.nextInt();
//            switch (choice){
//
//                case 1:
//                    System.out.println("Enter element to enter:");
//                    int e=in.nextInt();
//                    System.out.println("Enter an element to find  that is already existed in the list");
//                    int e2=in.nextInt();
//                    obj.insert_key(e2,e);
//                    System.out.println("Element Enqueued");
//                    break;
//                case 2:
//                    System.out.println("Enter an ele which u want to delete");
//                    int e1=in.nextInt();
//                    obj.Delete_element(e1);
//                    break;
//                case 3:
//                    obj.print_list();
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
//    }
//}
//
//











//slo2-----------------------------------------------------------------
import java.util.Scanner;

public class Liknedlist {

    static class Node {
        int data;
        Node next;
        Node(int d) { data = d; next = null; }
    }

    Node root;

    void insert_left(int data){
        Node n=new Node(data);
        if(root==null)
        {
            root=n;
        }else{
            n.next=root;  //1st
            root=n;  //2nd
        }
    }

    void insert_right(int data){
        Node n=new Node(data);
        if(root==null)
        {
            root=n;
        }else{
            Node t=root;    //asssign t to root
            while(t.next!=null){
                t=t.next;       ///2 move t tonext util t 's next =null
            }
            t.next=n;    //3connected

        }
    }


    void delete_left(){

        if(root==null)
        {
            System.out.println("List is empty");
        }else{
            Node t=root;  //1st
            root=root.next;  ////2nd
            System.out.println("Deleted:"+t.data);
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
            while(t.next!=null)//2
            {t2=t;
                t=t.next;
            }
            if(t==root)//single node
                root=null;//manual deletion
            else
                t2.next=null;//break the link
            System.out.println("Deleted:"+t.data);//3 response message of deletion
        }
    }

    void print_list(){
        if(root==null){
            System.out.println("Linked list is null");
        }else{
            Node t=root;
            System.out.print("|");
            while(t!=null){
                System.out.print(t.data + (t.next!=null ? "|->|" : "|"));
                t=t.next;
            }
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
       Liknedlist list = new Liknedlist();

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

//output:-
//C:\Users\basaid\.jdks\openjdk-25.0.1\bin\java.exe "-javaagent:C:\Program Files\JetBrains\IntelliJ IDEA Community Edition 2025.2.4\lib\idea_rt.jar=52712" -Dfile.encoding=UTF-8 -Dsun.stdout.encoding=UTF-8 -Dsun.stderr.encoding=UTF-8 -classpath C:\Users\basaid\IdeaProjects\DSA_java\out\production\LinkedList Liknedlist
//
//======== LINKED LIST MENU ========
//        1. Insert Left
//2. Insert Right
//3. Delete Left
//4. Delete Right
//5. Print List
//6. Search Element
//7. Delete Element
//8. Insert After
//9. Sort List
//0. Exit
//==================================
//Enter your choice: 1
//Enter data to insert left: 20
//
//        ======== LINKED LIST MENU ========
//        1. Insert Left
//2. Insert Right
//3. Delete Left
//4. Delete Right
//5. Print List
//6. Search Element
//7. Delete Element
//8. Insert After
//9. Sort List
//0. Exit
//==================================
//Enter your choice: 1 30
//Enter data to insert left:
//        ======== LINKED LIST MENU ========
//        1. Insert Left
//2. Insert Right
//3. Delete Left
//4. Delete Right
//5. Print List
//6. Search Element
//7. Delete Element
//8. Insert After
//9. Sort List
//0. Exit
//==================================
//Enter your choice: 1 40
//Enter data to insert left:
//        ======== LINKED LIST MENU ========
//        1. Insert Left
//2. Insert Right
//3. Delete Left
//4. Delete Right
//5. Print List
//6. Search Element
//7. Delete Element
//8. Insert After
//9. Sort List
//0. Exit
//==================================
//Enter your choice: 5
//        |40|->|30|->|20|
//
//        ======== LINKED LIST MENU ========
//        1. Insert Left
//2. Insert Right
//3. Delete Left
//4. Delete Right
//5. Print List
//6. Search Element
//7. Delete Element
//8. Insert After
//9. Sort List
//0. Exit
//==================================
//Enter your choice: 0
//Exiting .. coded by amar.career👋
//
//Process finished with exit code 0
