public class printNthLevel {
    public static class Node{
        int val; // 0
        Node left; // null
        Node right; // null

        public Node(int val) {
            this.val = val;
        }
    }

    public static void nthLevel1(Node root , int n){
        if(root==null) return;
        if(n==1){
            System.out.print(root.val+" ");
            return;
        }
        nthLevel1(root.left,n-1);
        nthLevel1(root.right,n-1);
    }

    public static void nthLevel2(Node root , int n){
        if(root==null) return;
        if(n==1){
            System.out.print(root.val+" ");
            return;
        }
        nthLevel2(root.right,n-1);
        nthLevel2(root.left,n-1);

    }

    public static int height(Node root) {
        if (root == null || (root.left == null && root.right == null)) return 0;
        return 1 + Math.max(height(root.left), height(root.right));
    }
    public static void main(String[] args) {
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

        int level = height(root) + 1;
        for(int i=1 ; i<=level ; i++){
            if(i%2!=0) nthLevel1(root,i);
            else nthLevel2(root,i);
            System.out.println();
        }
    }
}
