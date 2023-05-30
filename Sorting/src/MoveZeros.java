public class MoveZeros {

    static void moveZeros(int[] arr) {

        int n = arr.length;
        for(int i=0 ; i<n-1 ; i++){
        for (int j=0 ; j<n-i-1; j++) {
            if (arr[j] == 0 && arr[j + 1] != 0) {
                int temp = arr[j];
                arr[j] = arr[j + 1];
                arr[j + 1] = temp;
            }
        }
    }
}
    public static void main(String[] args) {
        int [] arr = {0,5,0,4,2,0,8,0};
        int n = arr.length;
        moveZeros(arr);
        for(int i =0 ; i<n ; i++){
            System.out.print(arr[i] + " ");
        }
    }
    }

