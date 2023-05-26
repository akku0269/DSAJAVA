package ArrayInRecursion;

public class SumOfSubsets {

    static void subsetSum(int[] arr ,int n ,  int idx , int currSum){
      if(idx>=n){
          System.out.println(currSum);
          return;
      }

        // curr idx +sum
        subsetSum(arr,n,idx+1,currSum + arr[idx]);

        // curr ans
        subsetSum(arr,n,idx+1,currSum);

    }
    public static void main(String[] args) {
        int[] arr = {2,4,5};
        subsetSum(arr, arr.length,0,0);

    }
}
