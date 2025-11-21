public class TreeImplem {

    static class Node {
        int data;
        Node left;
        Node right;

        Node(int d) {
            data = d;
            left = right = null;
        }
    }

   static Node root;

  static  void insert_node(Node r, Node n) {   // r->root,new node-->n
        if (root == null) {
            root = n;
            System.out.println("\n"+root.data+" inserted");
        } else {
            if (n.data < r.data) {
                if (r.left == null) {
                    r.left = n;
                    System.out.println(n.data+ " inserted");
                } else {
                    insert_node(r.left, n);
                }
            }else{
                if(r.right==null){
                    r.right=n;
                   System.out.println(n.data+ " inserted");
                }else{
                    insert_node(r.right, n);
                }
            }
        }
    }

  static  void inorder(Node r){
      if (r != null) {
          inorder(r.left);
          System.out.print(r.data+" ");
          inorder(r.right);
      }
    }

    static  void preorder(Node r){
        if (r != null) {
            System.out.print(r.data+" ");
            preorder(r.left);
            preorder(r.right);
        }
    }

    static  void postorder(Node r){
        if (r != null) {
            postorder(r.left);
            postorder(r.right);
            System.out.print(r.data+" ");

        }
    }
    static Node get_root(){
      return TreeImplem.root;
    }

    static int count_node(Node r){
      if(r==null)
          return 0;
      return 1+count_node(r.left)+count_node(r.right);

    }

    static int count_leaf(Node r) {
        if (r == null) {
            return 0;
        }
        if (r.left == null && r.right == null) {
            return 1;
        }
        return count_leaf(r.left) + count_leaf(r.right);
    }

        static int sum_of_ele (Node r){

            if (r == null)
                return 0;
            return r.data + sum_of_ele(r.left) + sum_of_ele(r.right);


        }


        public static void main (String[]args){


            TreeImplem.insert_node(TreeImplem.get_root(), new Node(10));
            TreeImplem.insert_node(TreeImplem.get_root(), new Node(5));
            TreeImplem.insert_node(TreeImplem.get_root(), new Node(20));
            TreeImplem.insert_node(TreeImplem.get_root(), new Node(15));
            System.out.println();
            TreeImplem.inorder(TreeImplem.get_root());
            System.out.println();
            TreeImplem.preorder(TreeImplem.get_root());
            System.out.println();
            TreeImplem.postorder(TreeImplem.get_root());
            System.out.println();



            System.out.println("Count nodes: " + TreeImplem.count_node(TreeImplem.get_root()));
            System.out.println("Count leaves: " + TreeImplem.count_leaf(TreeImplem.get_root()));
            System.out.println("Sum of elements: " + sum_of_ele(TreeImplem.get_root()));

        }


    }