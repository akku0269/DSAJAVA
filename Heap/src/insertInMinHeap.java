import java.util.ArrayList;
import java.util.List;

public class insertInMinHeap {
    private static void swap(List<Integer> heap, int l , int r){
        int temp = heap.get(l);
        heap.set(l, heap.get(r));
        heap.set(r,temp);
    }

    private static void push_up_in_minHeap(List<Integer> heap, int i) {
        int parentIdx = (i - 1) / 2;
        // until root reached / correct position found
        if (i == 0 || heap.get(parentIdx) < heap.get(i)) {
            return;
        }
        // swap
        swap(heap,i,parentIdx);

        push_up_in_minHeap(heap,parentIdx);
    }

    private static void insertInMinHeap( List<Integer> heap , int element){
        heap.add(element); // last me add krna hai
        int index = heap.size()-1;
        push_up_in_minHeap(heap,index);
    }

    public static void main(String[] args) {
        List<Integer> heap = new ArrayList<>();
        heap.add(10);
        heap.add(20);
        heap.add(30);
        heap.add(40);
        heap.add(50);
        System.out.println(heap);
        insertInMinHeap(heap,5);
        System.out.println(heap);
    }
}
