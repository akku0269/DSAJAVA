package InterviewQues;



public class OddEvenLinkedListMerge {

    public static ListNode oddEvenList(ListNode head) {
        ListNode odd = new ListNode(-1);
        ListNode even = new ListNode(0);
        ListNode tempO = odd;
        ListNode tempE = even;
        ListNode temp = head ;
        if (head == null) return null;
        while(temp!=null){
            if(temp.val%2!=0){
                ListNode a = new ListNode(temp.val);
                tempO.next = a;
                tempO = a;
                temp = temp.next;
            }else{
                ListNode b = new ListNode(temp.val);
                tempE.next = b;
                tempE = b;
                temp = temp.next;
            }
        }
        odd = odd.next;
        even = even.next;
        tempO.next= even;

        return odd;
    }

    public static class ListNode {
        int val;
        ListNode next;

        ListNode(int data) {
            this.val = data;
        }
    }

    public static void display(ListNode head){

        while (head!=null){
            System.out.print(head.val +" ");
            head = head.next;
        }
    }

    public static void main(String[] args) {

       ListNode a = new ListNode(3);
       ListNode b = new ListNode(6);
       ListNode c = new ListNode(8);
       ListNode d = new ListNode(5);
       ListNode e = new ListNode(1);
       ListNode f = new ListNode(4);

       a.next = b;
       b.next = c;
       c.next = d;
       d.next = e;
       e.next = f;

       System.out.println("LinkedList before Rearranging");
       display(a);
       a= oddEvenList(a);
       System.out.println();
       System.out.println("LinkedList after Rearranging");
       display(a);
    }
}