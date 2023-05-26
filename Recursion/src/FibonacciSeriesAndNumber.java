import java.util.*;
public class FibonacciSeriesAndNumber {

    static int fibonacci(int n){
        // base case
        if(n==0) return 0;  //  if(n==0) return n;
        if(n==1) return 1;  //  if(n==1) return n;

        // sub problem - recursive work

//        int prev = fibonacci(n-1);
//        int prevPrev = fibonacci(n-2);

        // self work
        //  int ans = fibonacci(n-1) + fibonacci(n-2);  // we can also write direct return statement, ans variable is not needed

        return fibonacci(n-1) + fibonacci(n-2);

    }
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i =0 ; i<=n ; i++)
        System.out.print(fibonacci(i)+" ");

    }
}
