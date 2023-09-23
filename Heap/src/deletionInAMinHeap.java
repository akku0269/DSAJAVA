import java.util.ArrayList;
import java.util.List;

public class deletionInAMinHeap {
    private static void swap(List<Integer> heap, int l , int r){
        int temp = heap.get(l);
        heap.set(l, heap.get(r));
        heap.set(r,temp);
    }

    private static void deleteFromMinHeap(List<Integer> heap){
        swap(heap,0,heap.size()-1);
        heap.remove(heap.size()-1);

        push_down_in_MinHeap(heap,0);
    }

    private static void push_down_in_MinHeap(List<Integer> heap, int index) {

    int n = heap.size()-1;
        // base case
        if (index == n) {
            return;
        }

        int leftChild = (2 * index) + 1;
        int rightChild = (2 * index) + 2;
        int smallest = index;

        if (leftChild <= n && heap.get(leftChild) < heap.get(smallest)) {
            smallest = leftChild;
        }

        if (rightChild <= n && heap.get(rightChild) < heap.get(smallest)) {
            smallest = rightChild;
        }

        if (smallest == index) {
            return;
        }
        swap(heap, index, smallest);
        push_down_in_MinHeap(heap, smallest);
    }
        public static void main(String[] args) {
            List<Integer> heap = new ArrayList<>();
            heap.add(5);
            heap.add(20);
            heap.add(10);
            heap.add(40);
            heap.add(50);
            heap.add(30);
            heap.add(60);
            System.out.println(heap);
            deleteFromMinHeap(heap);
            System.out.println(heap);
        }

}
