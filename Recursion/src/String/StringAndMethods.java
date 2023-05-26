package String;

import java.util.Scanner;

public class StringAndMethods {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        System.out.println(s);
        System.out.println("-----------------------");
        System.out.println(s.substring(2,6));
        System.out.println("-----------------------");


        char ch = s.charAt(0);

        for(int i =0 ; i< s.length() ; i++){
            System.out.println(s.charAt(i));
        }
    }
}
