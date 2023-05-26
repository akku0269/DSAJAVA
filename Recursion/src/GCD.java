import java.util.Scanner;

public class GCD {
    static int Gcd(int x, int y) {

        if (y == 0) return x;

        return Gcd(y, x % y);
    }
    static int Gcdi(int x, int y) {

        while (x % y != 0) {
            int rem = x % y;
            x = y;
            y = rem;
        }
        return y;
    }

    public static void main(String[] args) {
        System.out.println("Enter x :");
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        System.out.println("Enter y :");
        int y = sc.nextInt();

        System.out.println("GCD is");
        System.out.println(Gcd(x,y));

        System.out.println("GCD Brute approach");
        System.out.println(Gcdi(x,y));
    }
}
