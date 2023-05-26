package Assignment;

// Q.1    Given a number n. Print if it is an armstrong number or not.
//
//        An armstrong number is a number if the sum of every digit in that number raised to the power
//        of total digits in that number is equal to the number.
//
//        Example : 153 = 1^3 + 5^3 + 3^3 = 1 + 125 + 27 = 153 hence 153 is an armstrong number

import java.util.Scanner;

public class Q3 {

    static int power(int x , int y ){
        if(y==0) return 1;

        int pow = power(x,y/2);

        if(y%2==0){
            return pow * pow;
        }
        else return pow * pow * x;
    }

    /* Function to calculate order of the number */
    static int order(int x ){

        int n = 0;
        while(x!=0){
            n++;
            x=x/10;
        }
        return n;
    }

    boolean isArmstrong(int x){
        int n = order(x);
        int temp = x, sum = 0;
        while (temp != 0) {
            int r = temp % 10;
            sum = sum + power(r, n);
            temp = temp / 10;
        }

        // If satisfies Armstrong condition
        return (sum == x);
    }

    public static void main(String[] args) {
        System.out.println("Enter n: ");
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        // object creation and calling
        Q3 Armstrong = new Q3();

        System.out.println(Armstrong.isArmstrong(x));


    }
}
