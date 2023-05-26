import java.util.Scanner;

public class Recursion1 {

    static void printDecreasing(int n){ // if n=5 : 5,4,3,2,1
        // base case
        if(n==1){
            System.out.println(1);
            return;
        }
        // self work
        System.out.println(n);   // n

        // recursive work
        printDecreasing(n-1);  // n-1 , n-2 , .... 1
    }

    static void printIncreasing(int n){  // 1,2,3,4 ,..... ,n-1,n.
        // base case

        if(n==1){
            System.out.println(1);
            return;
        }
        // recursive work
        printIncreasing(n-1); // 1,2,3,....,n-1.

        // self work
        System.out.println(n);
    }

    public static void main(String[] args) {
        System.out.println("Enter n");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();


      //  printIncreasing(n);
        System.out.println("--------------------");
        printDecreasing(n);
    }
}
