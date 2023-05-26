public class CountSort {

    static void displayArr(int[] arr){
        for (int val:arr) {
            System.out.print(val +" ");
        }
    }

    static int findMax(int[] arr){
        int mx = Integer.MIN_VALUE;
        for(int i = 0 ;i< arr.length ; i++){
            if(arr[i]>mx){
                mx = arr[i];
            }
        }
        return mx;
    }

    static void basicCountSort(int[] arr){
        int max = findMax(arr); // find the largest element of arr
        int[] count = new int[max+1];
        for(int i = 0; i< arr.length ; i++){
            count[arr[i]]++;
        }
        int k =0;
        for(int i = 0; i< count.length ; i++){
            for(int j =0; j<count[i] ; j++){
                arr[k++] = i;
            }

        }
    }

    public static void main(String[] args) {
        int [] arr ={4,1,4,3,2,5,2};
        basicCountSort(arr);
        displayArr(arr);
    }
}
