package String;

import java.util.ArrayList;
import java.util.Scanner;

public class ReturnSubsequences {

    static ArrayList<String> getSSQ(String s) {

        ArrayList<String> ans = new ArrayList<>();
        // base case
        if(s.length()==0){
            ans.add("");
            return ans ;
        }

        char curr = s.charAt(0);  //a
        ArrayList<String> smallAns = getSSQ(s.substring(1)); // [ "bc" , "b" , "c" , ""]

        // smallAns = [ "bc" , "b" , "c" , ""]
        // ans = [ "bc" , "abc" , "b" , "ab" , "c" , "ac" , "" , "a"]
        for(String ss:smallAns){
            ans.add(ss);
            ans.add(curr+ss);
        }
        return ans;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();

        ArrayList<String> ans = getSSQ(s);
        for(String ss : ans){
            System.out.println(ss);
        }
     //   System.out.println(getSSQ(s));
    }
}
