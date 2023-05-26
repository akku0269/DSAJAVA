public class MissingNumber {
    public static void main(String[] args) {

    int[] arr = {1,2,3,4,5,7};
    int n = arr.length;

    // Taken n as n+1 in sum of natural no. formula because we have 1 missing no. also

    int Sum_Natural_Num = ((n+1)*(n+2))/2;
    int sum =0;

    for(int i =0 ;i<n ; i++)
    {
        sum += arr[i];
    }

    int missing_Element = Sum_Natural_Num - sum;

        System.out.println("Missing Number is : " +missing_Element);
}
}
