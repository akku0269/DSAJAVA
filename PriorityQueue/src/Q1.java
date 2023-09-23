
// sort and find kth largest element

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.PriorityQueue;

public class Q1 {
    public static void main(String[] args) {
        List<Integer> arr = new ArrayList<>();
        int k = 2;
        arr.add(3);
        arr.add(7);
        arr.add(2);
        arr.add(9);
        arr.add(5);

        List<Integer> sortedArr = new ArrayList<>(arr); // O(N)
        sortedArr.sort(Comparator.reverseOrder()); // O(N logN)
       // System.out.println(arr.get(k-1)); // O(1)


        // Better Approach
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for(int i = 0; i < arr.size()-1; i++){
            if(pq.size()==k){
                // agar top chota tha, remove top add element
                if(pq.peek()<arr.get(i)){
                    pq.poll();
                    pq.add(arr.get(i));
                }else{
                    continue;
                }
            }
            // for normal case
            pq.add(arr.get(i));

        }
        System.out.println(pq.peek());
    }
}
