import java.util.*;


public class TopView {
    public static class Node{
        int val;
        Node right;
        Node left;
        public Node(int val){
            this.val = val;
        }
    }

    public static int height(Node root) {
        if (root == null || (root.left == null && root.right == null)) return 0;
        return 1 + Math.max(height(root.left), height(root.right));
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

    public static Node constructBFS(String[] arr) {
        int x = Integer.parseInt(arr[0]);
        Node root = new Node(x);
        int n = arr.length;
        Queue<Node> q = new LinkedList<>();
        q.add(root);
        int i = 1;
        while (i < n - 1) {
            Node temp = q.remove();
            Node left = new Node(0);
            Node right = new Node(0);
            if (arr[i].equals("")) {
                left = null;
            } else {
                int l = Integer.parseInt(arr[i]);
                left.val = l;
                q.add(left);
            }
            if (arr[i + 1].equals("")) {
                right = null;
            } else {
                int r = Integer.parseInt(arr[i + 1]);
                right.val = r;
                q.add(right);
            }
            temp.left = left;
            temp.right = right;
            i += 2;
        }
        return root;
    }

    public static void main(String[] args) {
        String[] arr = {"1", "2", "3", "4", "5", "", "6", "", "", "", "", "7", "", "8", ""};
        Node root = constructBFS(arr);
        int level = height(root) + 1;
        for (int i = 1; i <= level; i++) {
            nthLevel1(root, i);
            System.out.println();
        }
        System.out.println("-------------------------");
        int leftCount = left(root);
        int rightCount = right(root);
        for(int i = 1-leftCount ; i<rightCount ; i++) { // i stands for vertical level
            printVertical(root, i, 0);
            System.out.println();
        }
    }


    private static void printVertical(Node root, int givenLevel, int currLevel) {
        if(root==null) return;
        if(currLevel==givenLevel){
            System.out.print(root.val);
            return; // used for top view
        }
        printVertical(root.left,givenLevel,currLevel-1);
        printVertical(root.right,givenLevel,currLevel+1);
    }

    private static int right(Node root) {
       if(root==null) return 0;
       return 1 + right(root.right);
    }

    private static int left(Node root) {
        if(root==null) return 0;
        return 1 + left(root.left);
    }
}


