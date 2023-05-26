public class SumOfDigits {

    static int sumOfDigits(int n) {

        if (n >= 0 && n <= 9) return n;

//       int smallAns = sumOfDigits(n/10);
//       int ans = n%10;
//
//       return smallAns+ans;

        return sumOfDigits(n / 10) + n % 10;

    }

    public static void main(String[] args) {
        System.out.println(sumOfDigits(123456));
    }
}
