package InterviewQues;

import java.util.Stack;

public class LeetCode2487 {
    public static class Node {
        int val;
       Node next;

        Node(int data) {
            this.val = data;
        }
    }

    public static Node removeNode(Node head){
       Stack<Node> st = new Stack<>();
       if(st.size()==0) st.push(head);
       else{
           Node curr = head;
           while(st.size()!=0 && st.peek().val<curr.val){
               st.pop();
           }
       }

    }
    public static void main(String[] args) {
        Node a = new Node(3);
        Node b = new Node(5);
        Node c = new Node(1);
        Node d = new Node(2);
        Node e = new Node(4);

        a.next = b;
        b.next = c;
        c.next = d;
        d.next = e;
    }
}
