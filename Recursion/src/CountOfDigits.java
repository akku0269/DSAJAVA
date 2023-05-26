import java.util.Scanner;

public class CountOfDigits {

    static int count(int n){
        // base case
        if(n>=0 && n<=9) return 1 ;

//        recursion work
//        int smallAns = count(n/10);
//
//         self-work
//        int ans = count(n/10) + 1 ;

        return  count(n/10) + 1 ;


    }
    public static void main(String[] args) {

        System.out.println("Enter n");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(count(n));

    }
}
