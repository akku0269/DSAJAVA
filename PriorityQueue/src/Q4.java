import java.util.*;

public class Q4 {
    public static void main(String[] args) {
        List<Integer> arr = new ArrayList<>();
        int k1 = 3;
        int k2 = 6;
        arr.add(20);
        arr.add(8);
        arr.add(22);
        arr.add(4);
        arr.add(12);
        arr.add(10);
        arr.add(14);

        // brute
        Collections.sort(arr);
        int sum = 0;
        for(int i = k1 ; i < k2-1 ; i++){
            sum += arr.get(i);
        }
    //    System.out.println(sum);

        // better approach
        PriorityQueue<Integer> pq = new PriorityQueue<>(Comparator.reverseOrder());
        for(int i=0 ; i<arr.size(); i++){
            pq.add(arr.get(i));

            if(pq.size()>k2){
                pq.remove();
            }
        } // O(N logN + (N-K2) logN)
        //smallest k2 elements
        pq.remove();
        // remove k2th element

        sum=0;
        while(pq.size() !=k1){ //O(K2-K1) log K2
            sum += pq.remove();
        }
        // O(N logN + (N-K2) logN + (K2-K1) logK2) = NlogN
        // 0(K2)
        System.out.println(sum);
    }
}
