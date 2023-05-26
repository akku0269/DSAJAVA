package BinarySearch.Imp;

public class carRaceing {

    static boolean isPossible(int[] a , int k , int dist){
        int kidsPlaced = 0;
        int lastkid = a[0];
        for(int i =0; i<a.length ; i++){
            if(a[i] >= dist){
                kidsPlaced++ ;
                lastkid = a[i];
            }
        }
        return kidsPlaced>=k;
    }

    static int raceTrack(int[] a , int k){
        if(k>a.length) return -1;
        int st = 0 , end =(int)1e9;
        int ans =-1;
        while(st<=end){
            int mid = st + (end-st)/2;
            if(isPossible(a,k,mid)){
                ans= mid;
                st = mid+1;
            }else {
                end = mid-1;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        int[] a ={1,2,4,8,9};
        int k =3;
        System.out.println(raceTrack(a,k));
    }
}
