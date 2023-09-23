import java.util.*;

public class FibonacciSeriesAndNumber {

    static int fibonacci(int n) {
        // base case
        if (n == 0) return 0;
        if (n == 1) return 1;

        return fibonacci(n - 1) + fibonacci(n - 2);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            System.out.print(fibonacci(i) + " ");
        }
    }
}








