package String;

import java.util.Scanner;

public class SubsequencesBestMethod {

    static void printSubsequences(String s, String currAns){        // s = "abc"

        if(s.length()==0){
            System.out.println(currAns);
            return;
        }

        char curr = s.charAt(0); // a
        String remString = s.substring(1);  // bc

        // Curr char -> chooses to be a part of currAns
        printSubsequences(remString,currAns + curr); // bc,a

        // Curr char -> does not choose to be a part of currAns
        printSubsequences(remString,currAns); // bc ," "
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        printSubsequences(s ,"");
    }
}
