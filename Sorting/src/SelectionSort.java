public class SelectionSort {

    static void selectionSort(int [] arr){
        int n = arr.length;
        for(int i=0 ; i<n-1 ; i++){ // i represent the current index
          int min_Index=i;
          for(int j = i+1 ; j<n ; j++){
              if(arr[j]<arr[min_Index]){
                  min_Index=j;
              }
          }
          // swap current element and minimum element -> current index i will have
            // arr[min_index] , arr[i]
          int temp = arr[i];
          arr[i] = arr[min_Index];
          arr[min_Index]= temp;
        }
    }

    public static void main(String[] args) {
        int[] arr = {7,4,5,1,2};
        selectionSort(arr);
        for(int i=0 ; i<arr.length ; i++){
            System.out.println(arr[i]+" ");
        }
    }
}
