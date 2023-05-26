package InterviewQuestions;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class ReOrderQueueUsingStack {
    public static void main(String[] args) {
        Queue<Integer> q = new LinkedList<>();
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);
        q.add(6);
        q.add(7);
        q.add(8);
        System.out.println(q);  // 1 2 3 4 5 6 7 8
        Stack<Integer> st = new Stack<>();
        int n = q.size();
        for (int i = 1; i <= (n/2); i++) {
            st.push(q.remove());  // 5 6 7 8 (Queue) , 1 2 3 4 (Stack)
        }
        while (st.size() > 0) {
            q.add(st.pop()); // 5 6 7 8 4 3 2 1
        }
        for (int i = 1; i <= (n/2); i++) {
            st.push(q.remove());  // 4 3 2 1 (Queue) , 8 7 6 5 (Stack)
        }
        while (st.size() > 0) {
            // one by one alternate , pehle stack se fir queue se
            q.add(st.pop());
            q.add(q.remove());
        }
    //    System.out.println(q);
       // reverse the queue
       while (q.size()>0){
            st.push(q.remove());
        }
       while (st.size()>0){
           q.add(st.pop());  // 1 5 2 6 3 7 4 8
       }
        System.out.println(q);
    }
}