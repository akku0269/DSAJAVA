package InterviewQuestions;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;

public class ReverseKElements {
    public static void main(String[] args) {
        Queue<Integer> q = new LinkedList<>();
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);
        System.out.println(q);

        Stack<Integer> st = new Stack<>();

        System.out.println("Enter k : ");
        Scanner sc = new Scanner(System.in);
        int k = sc.nextInt();
        
        for(int i = 0; i<k ; i++){
            st.push(q.remove());
        }
        while (st.size()>0){
            q.add(st.pop());
        }
        for(int i = 0 ; i< q.size()-k ; i++){
            q.add(q.remove());
        }
        System.out.println(q);
    }
}

