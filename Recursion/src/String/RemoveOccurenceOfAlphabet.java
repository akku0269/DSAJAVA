package String;

import java.util.Scanner;

public class RemoveOccurenceOfAlphabet {

    static String removeA2(String s ) { // Method 2
        int n = s.length();

        // base case
        if (n == 0) return "";

        // recursive work
        String smallAns = removeA2(s.substring(1));
        char currChar = s.charAt(0);

        // Self work
        if(currChar != 'a'){
            return currChar + smallAns;  // d + bcx
        }
        else {
            return smallAns;
        }
    }
    static String removeA(String s , int idx){  // Method 1
        int n = s.length();
        // base case
        if(idx == n){
            return "";
        }

        // recursive work
        String smallAns = removeA(s,idx+1);
        char currChar = s.charAt(idx);

        // Self work
        if(currChar != 'a'){
            return currChar + smallAns;  // d + bcx
        }
        else {
        return smallAns;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        System.out.println(removeA(s,0));
        System.out.println(removeA2(s));
    }
}
