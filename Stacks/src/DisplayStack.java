import java.util.Stack;


public class DisplayStack {

    public static void displayReverseRecursively(Stack<Integer> st){
        if(st.size()==0) return;
        int top = st.pop();
        System.out.print(top+" ");
        displayReverseRecursively(st);
        st.push(top);

    }
    public static void displayRecursively(Stack<Integer> st){
        if(st.size()==0) return;
        int top = st.pop();
        displayRecursively(st);
        System.out.print(top+" ");
        st.push(top);

    }

    public static void main(String[] args) {

        Stack<Integer> st = new Stack<>();
        st.push(1);
        st.push(2);
        st.push(3);
        st.push(4);
        st.push(5);


        displayReverseRecursively(st);
        System.out.println();
        displayRecursively(st);

//        Stack<Integer> rt = new Stack<>();
//        while (st.size()>0){
//            rt.push(st.pop());
//        }
//        while(rt.size()>0){
//            int x = rt.pop();
//            System.out.print(x+" ");
//            st.push(x);
//        }

//        int n = st.size();
//        int[] arr = new int[n];
//        for(int i = n-1; i>=0; i--){
//            arr[i] = st.pop();
//        }
//        for(int i=0 ;i<n ; i++){
//            System.out.print(arr[i]+" ");
//            st.push(arr[i]);
//        }
    }
}