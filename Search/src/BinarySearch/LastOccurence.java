package BinarySearch;

public class LastOccurence {
    static int lastOcc(int[] arr , int x){
        int n = arr.length;
        int st = 0 , end = n-1;
        int fo=-1;

        while(st<=end) {
            int mid = st + (end - st) / 2;
            if (arr[mid] == x) {
                fo = mid;
                st = mid + 1;
            } else if (arr[mid]<x) {
                st = mid+1;
            }else
                end = mid-1;
        }
        return fo;
    }
    public static void main(String[] args) {
        int[] arr = { 1,2,5,4,8,6,5,2,5,2,5,4,5} ;
        System.out.println(lastOcc(arr,5));

    }
}
