import java.util.*;

public class Factorial {

    static int factorial(int n){
      /*  // base case
        if(n==0)  return 1;

        // smaller problem - recursive work
        int smallAns = factorial(n-1);

        // self work
       int ans = n* smallAns;   */

        if(n==0)  return 1;    // small part of upper code , above code is more elaborated

        return n* factorial(n-1);
    }
    public static void main(String[] args) {

        System.out.println("Enter n");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(factorial(n));
    }
}
