package ArrayInRecursion;

public class SumOfSubsets {

    static void subsetSum(int[] arr  ,  int idx , int currSum){
        int n = arr.length;
        if(idx>=n){
          System.out.println(currSum);
          return;
        }

        // curr idx +sum
        subsetSum(arr,idx+1,currSum + arr[idx]);

        // curr ans
        subsetSum(arr,idx+1,currSum);

    }
    public static void main(String[] args) {

        int[] arr = {2,4,5};
        subsetSum(arr, 0,0);

    }
}
