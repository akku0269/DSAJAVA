package LinearSearch;

public class TargetElement {

    static boolean search(int[] arr , int target , int idx){

        int n = arr.length;
        // base case
        if(idx >= n) return false;

        // self work
        if(arr[idx]== target) return true;

        // recursive work
        return (search(arr,target,idx+1));

//        if(search(arr,target,idx+1)){
//            return true;
//        }
//        else return false;

    }
    public static void main(String[] args) {

        int[] arr ={1,2,4,6,8};
        int target = 4;
        if(search(arr,target,0)){
            System.out.println("Yes");
        }
        else{
            System.out.println("No");
        }

    }
}
