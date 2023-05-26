public class BasicsOfLinkedList {

    public static void insertAtEnd(Node head,int val){
        Node temp = new Node(val);
        Node t = head;
        while (t.next!=null){
            t = t.next;
        }
        t.next = temp;
    }

    public static void displayRecursively(Node head){
        if(head==null) return;
        System.out.print(head.data +" ");
        displayRecursively(head.next);
    }

    public static void displayReverse(Node head){
        if(head==null) return;
        displayRecursively(head.next);
        System.out.print(head.data +" ");
    }

    public static void display(Node head){

        while (head!=null){
            System.out.print(head.data +" ");
            head = head.next;
        }
    }

    public static int length(Node head){
        int count =0;
        while (head!=null){
            count++;
            head = head.next;
        }
        return count;
    }

    public static class Node{
        int data; // value
        Node next ;  // address of next code

        // constructor
        Node(int data){
            this.data = data;
        }
    }

    public static void main(String[] args) {

        Node a = new Node(5);
        Node b = new Node(3);
        Node c = new Node(9);
        Node d = new Node(8);
        Node e = new Node(16);

        // 5 -> 3 -> 9 -> 8 -> 16

        a.next = b; // 5 -> 3  9  8  16
        b.next = c; // 5 -> 3 -> 9  8  16
        c.next = d; // 5 -> 3 -> 9 -> 8  16
        d.next = e;

        display(a);
        System.out.println();
        displayRecursively(a);
        System.out.println();

        System.out.println("length is: "+length(a));

        insertAtEnd(a,87);
        display(a);



//        Node temp =a;
//        while (temp!= null){  // for displaying the node (isme length ki jarurat ni hai)
//            System.out.print(temp.data+" ");
//            temp = temp.next;
//        }

 /*     System.out.println(a.data);
        System.out.println(a.next.data);
        System.out.println(a.next.next.data);
        System.out.println(a.next.next.next.data);
        System.out.println(a.next.next.next.next.data);

        System.out.println(b.data);
        System.out.println(a.data);


        System.out.println(a);  //$Node@7b23ec81
        System.out.println(a.next);  //$Node@6acbcfc0
        System.out.println(b);  // $Node@6acbcfc0
        System.out.println(c);  // $Node@5f184fc6  */

    }
}
