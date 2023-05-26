package String;

import java.util.Scanner;

public class Palindrome {

    static boolean palindrome(String s , int l , int r) {

        if(l>=r) return true;

        return s.charAt(l) == s.charAt(r) && palindrome(s,l+1,r-1);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        System.out.println(palindrome(s,0,s.length()-1));
    }
}
