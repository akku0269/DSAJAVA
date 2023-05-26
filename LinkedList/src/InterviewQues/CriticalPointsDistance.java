package InterviewQues;

import java.util.Arrays;

public class CriticalPointsDistance {

    public static class ListNode {
        int val;
        ListNode next;

        ListNode(int val){
            this.val = val;
        }
    }
    
    public static int[] criticalDistance(ListNode head) {
        int index =2;
     ListNode prev = head;
     ListNode curr = head.next;
     int min = Integer.MAX_VALUE;
     int max = Integer.MIN_VALUE;
     int minDiff = Integer.MAX_VALUE;
     int prevCritical = 0;
     while(curr.next!=null){
         if((curr.val>prev.val && curr.val>curr.next.val) || (curr.val<prev.val && curr.val<curr.next.val)) {
             max = Math.max(max, index);
             min = Math.min(min, index);
             if (prevCritical != 0) minDiff = Math.min(minDiff, index - prevCritical);
             prevCritical = index;
         }
         prev = curr;
         curr = curr.next;
         index++;
     }
     if(min!=Integer.MAX_VALUE && max!=Integer.MIN_VALUE && min!=max){
         return new int[]{minDiff,max-min};
     }
     else {
         return new int[] {-1,-1};
     }
    }
    public static void main(String[] args) {
        ListNode a = new ListNode(4);
        ListNode b = new ListNode(10);
        ListNode c = new ListNode(2);
        ListNode d = new ListNode(5);
        ListNode e = new ListNode(13);
        ListNode f = new ListNode(3);
        ListNode g = new ListNode(12);



        a.next = b;
        b.next = c;
        c.next = d;
        d.next = e;
        e.next = f;
        f.next = g;


        System.out.println(Arrays.toString(criticalDistance(a)));

    }
}
