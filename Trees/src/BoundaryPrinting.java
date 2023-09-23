import java.util.LinkedList;
import java.util.Queue;

public class BoundaryPrinting {

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
                    int r = Integer.parseInt(arr[i+1]);
                    right.val = r;
                    q.add(right);
                }
                temp.left = left;
                temp.right = right;
                i+=2;
            }
            return root;
        }

    private static void boundaryDisplay(Node root) {
        LeftBoundary(root);
        BottomBoundary(root);
        RightBoundary(root.right); // ek baar root print kr chuke hai krke root.right se chalu kiye hai
    }

    private static void RightBoundary(Node root) {
        if(root==null) return;
        if(root.left==null && root.right==null) return;
        if(root.right!=null) RightBoundary(root.right);
        else RightBoundary(root.left);
        System.out.print(root.val+" "); // call badme lagaye hai kyuki ulta chahiye
    }

    private static void BottomBoundary(Node root) {
        if(root==null) return;
        if(root.left==null && root.right==null){
            System.out.print(root.val+" ");
            return;
        }
        BottomBoundary(root.left);
        BottomBoundary(root.right);
    }

    private static void LeftBoundary(Node root) {
        if(root==null) return;
        if(root.left==null && root.right==null) return;
        System.out.print(root.val+" ");
        if(root.left!=null) LeftBoundary(root.left);
        else LeftBoundary(root.right);
    }

    public static void main(String[] args) {
        String[] arr = {"1","2","3","4","5","","6","7","","8","","9","10","","11","","12","","13","","14","15","16","","17","","","18","","19","","", "","20","21","22","23","","24","25","26","27","","","28","",""};
        Node root = constructBFS(arr);
        boundaryDisplay(root);
    }
}
