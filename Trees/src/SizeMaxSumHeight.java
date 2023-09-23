public class SizeMaxSumHeight {
    static int size = 0;
    public static class Node{
        int val; // 0
        Node left; // null
        Node right; // null

        public Node(int val) {
            this.val = val;
        }
    }

    public static void preorder(Node root){
        if(root==null) return;
        //System.out.print(root.val+" ");
        size++;
        preorder(root.left);
        preorder(root.right);

    }

    public static int size(Node root){
        if(root==null) return 0;
        return 1+ size(root.left) + size(root.right);

    }

    public static int sumOfNodes(Node root){
        if(root==null) return 0;
        return root.val + sumOfNodes(root.left) + sumOfNodes(root.right);
    }

    public static int MaxValue(Node root){
        if(root==null) return Integer.MIN_VALUE; // kyuki 0 -1 se bada hai
//        int a = root.val;
//        int b = MaxValue(root.left);
//        int c = MaxValue(root.right);
//        return Math.max(a,Math.max(b,c));
        return Math.max(root.val,Math.max(MaxValue(root.left),MaxValue(root.right)));

    }

    public static int height(Node root){
        if(root==null || (root.left==null&& root.right==null)) return 0;
        return 1+ Math.max(height(root.left),height(root.right));

    }
    public static void main(String[] args) {
        Node root = new Node(10);
        Node a = new Node(20);
        Node b = new Node(300);
        root.left = a;
        root.right = b;
        Node c = new Node(40);
        Node d = new Node(50);
        a.left = c;
        a.right = d;
        Node e = new Node(30);
        b.right = e;
        preorder(root);
        System.out.println("Size of tree : " +size(root));
        System.out.println("Sum of Nodes : " +sumOfNodes(root));
        System.out.println("Maximum Value : " +MaxValue(root));
        System.out.println("Height : " +height(root));
    }
}
