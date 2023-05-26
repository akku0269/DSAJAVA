package BinarySearch.Imp;
//Problem 1: You have ‘n’(n <= u0^5) boxes of chocolate Each box contains a[i] (a[i] <= u0000) chocolates You
//        need to distribute these boxes among ‘m’ students such that the maximum number of chocolates allocated to
//        a student is minimum
//        1. One box will be allocated to exactly one student
//        2. All the boxes should be allocated
//        3. Each student has to be allocated at least one box
//        4. Allotment should be in contiguous order, for instance, a student cannot be allocated box u and box 3,
//        skipping box 2.
//        Calculate and return that minimum possible number.
//        Assume that it is always possible to distribute the chocolates.
//        The first line of input will contain the value of n, the number of boxes.
//        The second line of input will contain the n numbers denoting the number of chocolates in each box.
//        The third line will contain the m, number of students.

public class MinimumDistribution {

    static boolean isDivisionPossible(int[] a , int m, int MaxChocoAllowed){
        int NoOfStudents = 1;
        int choc = 0; // no. of chocolate current student has
        for (int i =0 ; i<a.length ; i++){
            if(a[i]>MaxChocoAllowed) return false;
            if(choc + a[i] <= MaxChocoAllowed){
                choc += a[i];
            }else {
                NoOfStudents ++ ;
                choc = a[i];
            }
        }
        if(NoOfStudents > m) return false;
        return true;
    }

    static int distributeChocolates(int[] a , int m){
        if(a.length<m) return -1;
        int ans = 0,  st = 1 , end = (int)1e9;

        while(st<=end){
            int mid = st +(end-st)/2;
            if(isDivisionPossible(a,m,mid)){
                ans = mid;
                end = mid-1;
            }else{
                st = mid+1;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        //int[] a = {5,3,1,4,2};
        int[] a = {12,34,67,90};
        int m =2;
        System.out.println(distributeChocolates(a,m));

    }
}
