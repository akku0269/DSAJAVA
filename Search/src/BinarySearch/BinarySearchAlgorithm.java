package BinarySearch;
// itrative          // recursive
// TC : O(logn)      // TC : O(n logn)
// SC : O()          // SC : O()




public class BinarySearchAlgorithm {

    static boolean binarySearch(int[] arr ,int target){
        int n = arr.length;
        int st =0 , end = n-1;
        while(st<=end){
         //   int mid =(st+end)/2;
            int mid = st + (end-st)/2;  // better way for finding mid

            if(target==arr[mid]){
                return true;
            } else if (target<arr[mid]) {
                end = mid-1;
            } else {
                st = mid+1;
            }
        }
        return false;

    }

    static boolean recursionBinarySearch(int[] arr, int st , int end , int target){
        if(st > end) return false; // base case
      //  int mid =(st+end)/2;
        int mid = st + (end-st)/2;  // better way for finding mid
        if(target== arr[mid]){
            return true;
        } else if (target<arr[mid]) {
            return recursionBinarySearch(arr,st,mid-1,target);  // sub problem
        } else
            return recursionBinarySearch(arr,mid+1,end,target);  // sub problem
    }


    public static void main(String[] args) {
        int[] arr = {2,4,5,7,15,24,25,45,50,77};
        int target = 0;
        while(target!=10){
       // System.out.printf("%d exists in arr: %b \n",target,binarySearch(arr,target));
        System.out.printf("%d exists in arr: %b \n",target,recursionBinarySearch(arr,0, arr.length-1,target)); // recursion
        target++;
    }
}
}
