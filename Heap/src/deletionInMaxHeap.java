import java.util.ArrayList;
import java.util.List;

public class deletionInMaxHeap {
    private static void swap(List<Integer> heap, int l , int r){
        int temp = heap.get(l);
        heap.set(l, heap.get(r));
        heap.set(r,temp);
    }

    private static void deleteFromMaxHeap(List<Integer> heap){
        swap(heap,0,heap.size()-1);
        heap.remove(heap.size()-1);

        push_down_in_MaxHeap(heap,0);
    }

    private static void push_down_in_MaxHeap(List<Integer> heap, int index) {
        int n = heap.size() - 1;
        // base case
        if (index == n) {
            return;
        }

        int leftChild = (2 * index) + 1;
        int rightChild = (2 * index) + 2;
        int biggest = index;

        if (leftChild <= n && heap.get(leftChild) > heap.get(biggest)) {
            biggest = leftChild;
        }

        if (rightChild <= n && heap.get(rightChild) > heap.get(biggest)) {
            biggest = rightChild;
        }

        if (biggest == index) {
            return;
        }
        swap(heap, index, biggest);
        push_down_in_MaxHeap(heap, biggest);
    }
    public static void main(String[] args) {
        List<Integer> heap = new ArrayList<>();
        heap.add(90);
        heap.add(80);
        heap.add(70);
        heap.add(20);
        heap.add(10);
        heap.add(50);
        heap.add(60);
        System.out.println(heap);
        deleteFromMaxHeap(heap);
        System.out.println(heap);
    }

}
