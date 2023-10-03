//Given N(very large), the task is to print the largest palindromic number obtained by permuting the digits of N. If
//        it is not possible to make a palindromic number, then print an appropriate message.
//        input : 313551
//        output : 531135


import java.util.ArrayList;
import java.util.List;

public class largestPalindromicNumberQ5 {
    public static void main(String[] args) {
        String number = "313551";
        List<Integer> frequency = new ArrayList<>();
        for(int i = 0; i < 10 ; i++){
            frequency.add(0);
        }
        int n = number.length();
        for(int i = 0 ; i < n ; i++){
            int digit = number.charAt(i)  - '0';  // 0 ka ascii code minus kr diye hai guys
            frequency.set(digit, frequency.get(digit) + 1); // increase freq by 1
        }

        if(!validate(frequency)){
            System.out.println("Palindrome not possible. ");
        }



    }

    private static boolean validate(List<Integer> frequency) {
        boolean isOdd = false;
        for(int i = 0; i<frequency.size(); i++){
            if(frequency.get(i) % 2 != 0){
                if(isOdd==true)
                    return false;
                else isOdd = true;
            }
        }
        return true;
    }
}
