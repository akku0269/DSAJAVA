package ArrayInRecursion;

public class PrintGivenArray {
    static void printArray(int[] arr , int idx){
        // base case
        if(idx== arr.length) return;

        // self-work
        System.out.println(arr[idx]); //5

        // recursive work - sub problem
        printArray(arr,idx+1);
    }
    public static void main(String[] args) {
        int[] arr = {5,4,6,7,3,2};
        printArray(arr,0);
    }
}
