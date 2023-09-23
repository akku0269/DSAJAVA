


public class PreInPost {
    public static void pip(int n){
        if(n==0) return;
        System.out.println("Pre  "+n); // Pre
        pip(n-1);
        System.out.println("In   "+n); // In
        pip(n-1);
        System.out.println("Post "+n); // Post
    }

    public static class Node{
        int val; // 0
        Node left; // null
        Node right; // null

        public Node(int val) {
            this.val = val;
        }
    }

    public static void InOrder(Node root){
        // InOrder is left root right
        if(root==null) return;
        InOrder(root.left);
        System.out.println(root.val);
        InOrder(root.right);
    }

    public static void preOrder(Node root){
        // preorder is root left right
        if(root==null) return;
        System.out.println(root.val);
        preOrder(root.left);
        preOrder(root.right);
    }

    public static void PostOrder(Node root){
        // postOrder is  left right root
        if(root==null) return;
        PostOrder(root.left);
        PostOrder(root.right);
        System.out.println(root.val);
    }

    public static void main(String[] args) {
       // pip(3);
        Node root = new Node(1);
        Node a = new Node(2);
        Node b = new Node(3);
        root.left = a;
        root.right = b;
        Node c = new Node(4);
        Node d = new Node(5);
        a.left = c;
        a.right = d;
        Node e = new Node(6);
        Node f = new Node(7);
        b.left = e;
        b.right = f;
        //  preOrder(root);
        // InOrder(root);
        PostOrder(root);
    }
}
