package Assignment1DArray;


//transverse over elements and print even elements;

import java.util.Scanner;

public class A2 {
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


        for(int i =0 ;i<n ; i++)
        {
            if(arr[i]%2==0){
                System.out.print(arr[i]+" ");
            }
        }


    }
}
