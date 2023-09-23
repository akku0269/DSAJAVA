import java.util.ArrayList;
import java.util.List;

public class insertInMaxHeap {

    private static void swap(List<Integer> heap, int l , int r){
        int temp = heap.get(l);
        heap.set(l, heap.get(r));
        heap.set(r,temp);
    }

    private static void insertInMaxHeap( List<Integer> heap , int element){
        heap.add(element); // last me add krna hai
        int index = heap.size()-1;
        push_up_in_maxHeap(heap,index);
    }

    private static void push_up_in_maxHeap(List<Integer> heap, int i) {
        int parentIdx = (i - 1) / 2;
        // until root reached / correct position found
        if (i == 0 || heap.get(parentIdx) > heap.get(i)) {
            return;
        }
        // swap
        swap(heap,i,parentIdx);

        push_up_in_maxHeap(heap,parentIdx);
    }


    public static void main(String[] args) {
        List<Integer> heap = new ArrayList<>();
        heap.add(60);
        heap.add(50);
        heap.add(40);
        heap.add(30);
        heap.add(20);
        heap.add(30);
        heap.add(10);
        System.out.println(heap);
        insertInMaxHeap(heap,40);
        System.out.println(heap);
    }
}
