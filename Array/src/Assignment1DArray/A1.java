package Assignment1DArray;
import java.util.*;

// to print the sum of elements present on even indices in given array

public class A1 {
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

        int sum =0 ;

        for(int i=0; i < n ; i++) {
            if (i % 2 == 0) {
                sum += arr[i];

            }
        }
        System.out.println("Sum of elements present at even indices is : " + sum);
}
}
