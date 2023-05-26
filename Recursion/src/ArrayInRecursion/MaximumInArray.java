package ArrayInRecursion;

public class MaximumInArray {

    static int Max(int [] arr , int idx){
        // base case
        if(idx == arr.length-1) {
            return arr[idx];
        }
        // small problem  - idx+1 - end of array - max - recursive
        int smallAns = Max(arr,idx+1);

        // self-work and final ans
        return Math.max(arr[idx],smallAns);

    }
    public static void main(String[] args) {
        int [] arr = {17,6,7,4,2,1,8};
        System.out.println(Max(arr,0));
     }
}
