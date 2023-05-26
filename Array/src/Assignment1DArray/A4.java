package Assignment1DArray;


// second largest elemnent in given array

import java.util.Arrays;
import java.util.Scanner;

public class A4 {

    static int[] SecondLargest(int [] arr){
        Arrays.sort(arr);
        int ans[] = {arr[0] , arr[arr.length-1]};

        return ans;
    }
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the value of n"); // input array
        int n = sc.nextInt();
        int[] arr = new int[n];

        System.out.println("Enter array elements");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

      int[] ans = SecondLargest(arr);
        System.out.println("Second Largest" + arr[1]);


    }
}