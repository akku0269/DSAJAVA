import java.util.HashMap;
import java.util.LinkedList;
import java.util.Queue;

public class bottomView {

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

    private static void bottomView(Node root, int level, HashMap<Integer, Integer> map) {
        if(root==null) return;
        if(map.containsKey(level)){
            map.remove(level);
            map.put(level, root.val);
        }else {
            map.put(level,root.val);
        }
        bottomView(root.right,level+1,map);
        bottomView(root.left,level-1,map);
    }

    private static int right(Node root) {
       if(root==null) return 0;
       return 1 + right(root.right);
    }

    private static int left(Node root) {
        if(root==null) return 0;
        return 1 + left(root.left);
    }

    public static void main(String[] args) {
        String[] arr = {"1", "2", "3", "4", "5","6", "7"};
        Node root = constructBFS(arr);
        int level = height(root) + 1;
        for (int i = 1; i <= level; i++) {
            nthLevel1(root, i);
            System.out.println();
        }
        System.out.println("-------------------------");
        int leftCount = left(root);
        int rightCount = right(root);

        HashMap<Integer, Integer> map = new HashMap<>();
        bottomView(root, 0, map);
//        for(int key : map.keySet()){
//            System.out.println(key+" "+map.get(key));
//        }
        for (int i = 1 - leftCount; i < rightCount; i++) {
            System.out.print(map.get(i) + " ");

        }
    }
}
