package Assignment;

import java.util.Scanner;

// Q3 - Given a number n, check whether it's a prime number or not using recursion.

public class PrimeNo {
    static int i=2;
    static boolean isPrime(int n){

        // corner cases
        if(n==0 && n==1) return false;

        // checking prime
        if(n == i) return true;
        // base case
        if(n%i ==0) return false;

        i++;

        return isPrime(n);

    }
    public static void main(String[] args) {
        System.out.println("Enter n");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        System.out.println(isPrime(n));
    }
}
