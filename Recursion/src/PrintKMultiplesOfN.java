import java.util.Scanner;

public class PrintKMultiplesOfN {

    static void PrintMulti(int n , int k){

        // base case
         if(k==0)
         {
             System.out.println(n);
             return;
         }

//      if(k==0) return;                     [this can also be base case]

        //  recursive work
        PrintMulti(n,k-1);

        // self-work
        System.out.println(n*k);

    }
    public static void main(String[] args) {
        System.out.println("Enter n :");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println("Enter k :");
        int k = sc.nextInt();
        PrintMulti(n,k);
    }
}
