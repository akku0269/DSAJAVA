import java.math.BigInteger;
import java.util.Scanner;

public class Power2ndMethod {

    static int pow(int p , int q){
        if(q==0) return 1;

        int smallPow = pow(p , q/2); // written here because we have to write 2 times this statement

        if(q%2==0)
        {
            return smallPow * smallPow ;     // for even q
        }                                    //  int smallPow = pow(p , q/2);
        else
        {
            return p * smallPow* smallPow;   // for odd q
        }                                     //Pow = pow(p , q/2);


    }
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter p");
        int p = sc.nextInt();
         System.out.println("Enter q");
        int q = sc.nextInt();

        System.out.println(pow(p,q));
    }
}
