package Assignment;


// Q.2 Find m-th summation of first n natural numbers where m-th summation of first n natural
//         numbers is defined as following:
//         If m > 1: SUM(n, m) = SUM(SUM(n, m - 1), 1)
//         Else :SUM(n, 1) = Sum of first n natural numbers


import java.util.Scanner;

public class Q2 {

    static int sum(int n ,int m){
      if(m==1){
          return (n*(n+1))/2;
      }
      int sum1 = sum(n,m-1);

      return (sum1*(sum1+1))/2;

    }
    public static void main(String[] args) {
        System.out.println("Enter n: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println("Enter m: ");
        int m = sc.nextInt();

        System.out.println(sum(n,m));
    }
}
