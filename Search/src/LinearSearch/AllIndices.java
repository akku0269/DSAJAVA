package LinearSearch;

import java.util.ArrayList;

public class AllIndices {

    // arr 1,4,3,4
    // target =4
    // ans(arraylist) {1,3}

    static ArrayList<Integer> allIndices(int[] arr ,int target ,int idx) {

        int n = arr.length;
        ArrayList<Integer> ans = new ArrayList<>();

        // base case
        if(idx>=n){
            return ans; // return empty arraylist
        }

        // self work
        if(arr[idx]== target){ // ans -{0}
             ans.add(idx);
        }

        // recursive work
        ArrayList<Integer> smallAns = allIndices(arr,target,idx+1);  // smallAns - {1,3}

        ans.addAll(smallAns);

        return ans;
    }
    public static void main(String[] args) {
        int[] arr ={1,2,4,4,5,4};
        int target = 4;
        int n = arr.length;
        ArrayList<Integer> ans = allIndices(arr,target,0);
        System.out.println(ans);

    }
}
