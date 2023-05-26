package LinearSearch;

public class IdxOfTarget {

    // find first index , return index of target if target is present in array , otherwise return -1.

    static int findIndex(int[] arr , int target , int idx){
        int n = arr.length;

        // base case
        if(idx >= n) return -1;

        // self work
        if(arr[idx]== target) return idx;  // this question returns index

        // recursive work
        return (findIndex(arr,target,idx+1));
    }
    public static void main(String[] args) {

        int[] arr ={1,2,4,6,8};
        int target = 4;
        System.out.println(findIndex(arr,target,0));

    }
}
