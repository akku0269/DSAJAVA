public class BubbleSort {

    static void bubbleSort(int [] arr){
        int n = arr.length;
        for(int i =0 ; i<n-1 ; i++){
            boolean flag = false;  // has any swapping happened
            for(int j =0 ; j<n-i-1 ; j++){
                if(arr[j]>arr[j+1]){
                   int temp = arr[j];
                   arr[j] = arr[j+1];
                   arr[j+1] = temp;
                   flag = true;
                }
            }
            if(!flag){ // if(flag==false)
                return;
            }
        }
    }

    public static void main(String[] args) {

        int [] arr = {2,4,6,8,3,7,5,1};
        int n = arr.length;
        bubbleSort(arr);
        for(int i =0 ; i<n ; i++){
            System.out.print(arr[i] + " ");
        }
    }
}
