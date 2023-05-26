package String;

import java.util.Scanner;

public class ReverseString {

   static String reverse(String s , int idx){
       if(idx==s.length()) return "";
       String smallAns = reverse(s,idx+1);
       return smallAns + s.charAt(idx);
   }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        System.out.println(reverse(s,0));        // this is reverse output
//        String rev = reverse(s,0);
//
//        if(rev.equals(s)){
//            System.out.println(s +" lis Palindrome");
//        }
//        else {
//            System.out.println(s+ " is not Palindrome");
//        }
    }
}
