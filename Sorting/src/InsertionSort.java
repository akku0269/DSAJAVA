public class InsertionSort {

    static void insertionSort(int[] arr){
        int n = arr.length;
        for(int i =0 ; i<n ; i++){
            int j=i;
            while(j>0 && arr[j]<arr[j-1]){
                int temp = arr[j];
                arr[j] = arr[j-1];
                arr[j-1] = temp;
                j--;
            }
        }
    }
    public static void main(String[] args) {
        int [] arr = {2,4,6,8,7,5,1};
        int n = arr.length;
        insertionSort(arr);
        for(int i =0 ; i<n ; i++){
            System.out.print(arr[i] + " ");
        }
    }
    }
