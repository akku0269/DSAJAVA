import java.util.Scanner;

public class LCM {

    static int fun(int x, int y) {

        if (y == 0) return x;

        int hcf = fun(y , x%y);

        return (x*y)/hcf ;
    }
    public static void main(String[] args) {
        System.out.println("Enter x :");
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        System.out.println("Enter y :");
        int y = sc.nextInt();

        System.out.println("lcm is");
        System.out.println(fun(x,y));
    }
}
