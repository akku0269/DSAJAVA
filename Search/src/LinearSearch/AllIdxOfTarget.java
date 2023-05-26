package LinearSearch;

public class AllIdxOfTarget {

    static void findAllIndices(int[] arr ,int target , int idx){
        int n = arr.length;
        // base case
        if(idx>=n){
            return;
        }
        // self work
        if (arr[idx]== target) {
            System.out.println(idx);
        }

        findAllIndices(arr,target,idx+1);
    }
    public static void main(String[] args) {

        int[] arr ={1,4,2,6,2,4,3,2};
        int target =2;

        findAllIndices(arr,target,0);
    }

}
