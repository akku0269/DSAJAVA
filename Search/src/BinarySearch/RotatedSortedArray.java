package BinarySearch;

public class RotatedSortedArray {

    static int search(int[] arr ,int target){
        int n = arr.length;
        int st=0, end = n-1;
        while(st<=end){
            int mid = st + (end-st)/2;
            if(arr[mid] == target){
                return mid;
            } else if (arr[mid] < arr[end]) { // mid to end is sorted
                if(target>arr[mid] && target <= arr[end]){
                    st = mid+1;
                }
                else {
                    end = mid-1;
                }
        }
            else { // st to mid is sorted
                if(target>=arr[st] && target< arr[mid]){
                    end = mid-1;
                }
                else st = mid+1;
            }
    }
        return -1;
    }


    // with duplicate elements
    static int search2(int[] arr , int target){
        int n = arr.length;
        int st=0, end = n-1;
        while(st<=end){
            int mid = st + (end-st)/2;
            if(arr[mid] == target) {
                return mid;
            } else if (arr[st] == arr[mid] && arr[end] == arr[mid]) {
                st++;
                end--;
            } else if (arr[mid] <= arr[end]) {
                if(target > arr[mid] && target <= arr[end]){
                    st = mid+1;
                }else {
                    end = mid-1;
                }
            }else {
                if(target >= arr[st] && target < arr[mid]){
                    end = mid-1;
                }else {
                    st = mid+1;
                }
            }

        }
         return -1;
    }


    public static void main(String[] args) {
        int[] arr = {1,1,1,2,2,3,1};
        int target =2;
        System.out.println(search(arr,target));
        System.out.println(search2(arr,target));
    }
}
