package Assignment;

import java.util.Scanner;

// Q.1 Given a number n, print the following pattern without using any loop.

// n, n-5, n-10, …, 0, 5, 10, …, n-5, n

public class Q1 {

    static void series(int n,int m, boolean flag) {

        System.out.print(m + " ");

        // base case
        // flag indicates weather we need to add 5 or not
        if (flag == false && n == m) {
            return;
        }

        if (flag) {
            if (m - 5 > 0) {
                series(n, m - 5, true);
            } else {
                series(n, m - 5, false);
            }
        } else {
            series(n, m + 5, false);
        }

    }

    public static void main(String[] args) {
        int n = 16;
        series(n ,n ,true);
    }

}
