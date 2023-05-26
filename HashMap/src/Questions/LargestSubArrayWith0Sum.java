package Questions;

import java.util.HashMap;

public class LargestSubArrayWith0Sum {


   public static int zeroSumLargestSubArray(int[] arr, int n){
       HashMap<Integer,Integer> mp = new HashMap<>();
       // prefSum , index
       int maxLength = 0 , prefSum = 0;
       mp.put(0,-1);
       for(int i = 0 ;i<arr.length ; i++){
           prefSum += arr[i];
           if(mp.containsKey(prefSum)){
               maxLength = Math.max(maxLength , i-mp.get(prefSum));
           }else{
               mp.put(prefSum,i);
           }
       }
       return maxLength;
   }
}
