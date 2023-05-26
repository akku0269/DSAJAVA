package InterviewQuestions;

import java.util.Stack;

public class NextGreaterElementImp {


    public static int[] nextGreater1(int[] arr) {
        Stack<Integer> st = new Stack<>();
        int n = arr.length;
        int[] res = new int[arr.length];
        res[n-1] = -1; // last element ka next greater kuch ni ho skta
        for (int i = n - 2; i >= 0; i--) {  // last element ka next greater kuch ni ho skta krke n-2 se chalu kiye loop
            while (st.size() > 0 && st.peek() < arr[i]) {
                st.pop();
            }
            if (st.size() == 0) res[i] = -1;
            else res[i] = st.peek();
            st.push(arr[i]); // har element to akhari me push krna hai stack me
        }
        return res;
    }


    public static void main(String[] args) {

        int[] arr = {1, 3, 2, 1, 8, 6, 3, 4};
        int[] res = nextGreater1(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        for (int i = 0; i < res.length; i++) {
            System.out.print(res[i] + " ");

        }
    }

}







  /*  public static void main(String[] args) {
        int[] arr = {1, 3, 2, 1, 8, 6, 3, 4};
        int[] res = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            res[i] = -1;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] > arr[i]) {
                    res[i] = arr[j];
                    break;
                }
            }
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        for (int i = 0; i < res.length; i++) {
            System.out.print(res[i] + " ");

        }
    }*/
