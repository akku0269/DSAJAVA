import java.util.Scanner;

public class SeriesSumWithAlternateSign {

    static  int sum(int n){
        // base work
        if(n==0){
            return 0;
        }

        // recursive work
        if(n%2==0){ // even
            return sum(n-1) - n;
        }
        else {      // odd
            return sum(n-1) + n;
        }
    }
    public static void main(String[] args) {
        System.out.println("Enter n");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(sum(n));
    }
}
