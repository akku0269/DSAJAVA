package ArrayInRecursion;

public class Sum {

    static int sum(int[]arr , int idx){
        // base case
      //  if(idx == arr.length-1) return arr[idx];  this can also be written in base case but empty array is not included
        if(idx == arr.length){
            return 0;
        }
        // recursive work
        int smallAns = sum(arr, idx+1);

        // self - work
        return smallAns + arr[idx];
    }
    public static void main(String[] args) {
        int[] arr ={5,4,9,7,3,4,2};
        System.out.println(sum(arr ,0));
    }
}
