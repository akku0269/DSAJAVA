import java.util.Scanner;

public class SeriesSum {

    static int sum(int n){
        // base work
        if(n==0) return 0;

          // recursive work
//        int smallAns = sum(n-1);
//
//        int ans = smallAns + n;

        return  sum(n-1) + n;

    }
    public static void main(String[] args) {
        System.out.println("Enter n");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(sum(n));
    }
}
