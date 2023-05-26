package DoublyLinkedList;


// we will be given a sorted array
public class TwoSumInDoublyLinkedList {

    public static class Node{
        int val;
        Node next;
        Node prev;

        Node(int val){
            this.val = val;
        }
    }

    public static void display(Node head){
        Node temp = head;
        while(temp!=null){
            System.out.print(temp.val+" ");
        }
        System.out.println();
    }

    public static boolean TwoSum(Node head, Node tail , int target){
        Node h = head;
        Node t = tail;
        while(h.val<t.val){
            if(h.val+t.val==target){
                System.out.println(target);
                break;
            }else if(h.val+t.val>target) t = t.prev;
            else h = h.next;
        }
      return false;
    }
    public static void main(String[] args) {
        Node a = new Node(4);
        Node b = new Node(7);
        Node c = new Node(9);
        Node d = new Node(14);
        Node e = new Node(18);

        a.prev = null;
        a.next = b;
        b.prev = a;
        b.next = c;
        c.prev = b;
        c.next = d;
        d.prev = c;
        d.next = e;
        e.prev = d;
        e.next = null;


    }
}
