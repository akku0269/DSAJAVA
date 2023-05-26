package Assignment;

// Q2 - Given two number x and y find product using recursion

import java.util.Scanner;

public class Q4 {

    static int Multiply(int x , int y) {

        if (x == 0 || y == 0) return 0;

        return (x + Multiply(x, y - 1));

    }
    public static void main(String[] args){
        System.out.println("Enter x: ");
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        System.out.println("Enter y: ");
        int y = sc.nextInt();

        System.out.println("Multiplication of " +x+" and "+y+" is "+Multiply(x,y));
    }
}
