package Assignment1DArray;

//program to calculate maximum number in array

import java.util.Scanner;

public class A3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the value of n"); // input array
        int n = sc.nextInt();
        int[] arr = new int[n];

        System.out.println("Enter array elements");
        for(int i =0 ; i<n ; i++)
        {
            arr[i] = sc.nextInt();
        }

       int max=0;
        for(int i=0 ; i<n  ; i++)
        {
            if(arr[i]>max)
            {
                max = arr[i];
            }
        }
        System.out.println(max);
    }
}
