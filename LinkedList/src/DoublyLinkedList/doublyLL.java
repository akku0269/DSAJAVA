package DoublyLinkedList;

public class doublyLL {

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
            temp = temp.next;
        }
        System.out.println();
    }

    public static void displayReverse(Node head){
        Node temp = head;
        while(temp.prev!=null){
            System.out.print(temp.val+" ");
            temp = temp.prev;
        }
        System.out.println();
    }

    public static void display2(Node random){
        Node temp = random;
        // Move this temp backwards to the head
        while(temp.prev!=null){
            temp = temp.prev;
        }
        // now temp is at head
        // print the list
        while(temp!=null){
            System.out.print(temp.val+" ");
            temp = temp.next;
        }
        System.out.println();
    }

    public static Node insertAtHead(Node head , int x){
        Node t = new Node(x);
        t.next = head;
        head.prev = t;
        head = t;
        return head;
    }
    public static void insertAtTail(Node head , int x){
        Node temp = head;
        // temp ko tail tk lejate hai
       while(temp.next!=null){
           temp = temp.next;
       }
       Node t = new Node(x);
       temp.next = t;
       t.prev = temp;
    }
    public static void insertAtIdx(Node head , int idx , int x){
        Node s = head;
        for(int i=0 ;i<idx-1; i++){
            s = s.next;
        }
        Node r = s.next;
        Node t = new Node(x);
        s.next = t;
        t.prev = s;
        t.next = r;
        r.prev = t;
    }







    public static void main(String[] args) {
        // 4 10 2 99 13
        Node a = new Node(4);
        Node b = new Node(10);
        Node c = new Node(2);
        Node d = new Node(99);
        Node e = new Node(13);

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

//        display(a);
//        displayReverse(e);
//        display2(c);
//
//        Node newHead = insertAtHead(a,35);
//        display(newHead);




        insertAtTail(a,90);
    //    4 10 2 99 13 90
        display(a);

        insertAtIdx(a,3,56);
        display(a);

    }
}
