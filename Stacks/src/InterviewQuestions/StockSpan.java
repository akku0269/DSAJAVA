package InterviewQuestions;

import java.util.Stack;

public class StockSpan {
    public static int[] stockSpan(int[] arr){
        Stack<Integer> st = new Stack<>();
        int[] span = new int[arr.length];
        st.push(0);
        span[0] = 1;

        for(int i =1 ; i< arr.length ; i++){
            while(st.size()>0 && arr[i] > arr[st.peek()]){
                st.pop();
            }
            if(st.size()==0){
                span[i] = i+1;
            }else {
                span[i] = i - st.peek();
            }
            st.push(i);
        }
        return span;
    }

    public static void main(String[] args) {
        int[] arr = {100 ,80, 60, 70, 60 ,75, 85};
        int[] res = stockSpan(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        for (int i = 0; i < res.length; i++) {
            System.out.print(res[i] + " ");

        }
    }
}

