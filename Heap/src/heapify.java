import java.util.ArrayList;
import java.util.List;

public class heapify {

    private static void swap(List<Integer> heap, int l, int r) {
        int temp = heap.get(l);
        heap.set(l, heap.get(r));
        heap.set(r, temp);
    }

    private static void heapify(List<Integer> arr) { // buildHeap
        int firstNonLeafNode = ((arr.size() - 1) - 1) / 2; // last element ka parent
        for (int i = firstNonLeafNode; i >= 0; i--) {
            push_down_in_MinHeap(arr, i, arr.size() - 1);
        }
    }

    private static void heapSort(List<Integer> arr){
        // convert into min heap
        heapify(arr);
        int n = arr.size()-1;
        for(int i = n ; i>0 ; i--){
            swap(arr,0,i);
            push_down_in_MinHeap(arr,0,i-1);
        }
    }
    private static void push_down_in_MinHeap (List < Integer > heap,int index ,int n ){
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
            push_down_in_MinHeap(heap, smallest,n);
        }

        public static void main (String[]args){
            List<Integer> heap = new ArrayList<>();
            heap.add(90);
            heap.add(80);
            heap.add(70);
            heap.add(20);
            heap.add(10);
            heap.add(50);
            heap.add(60);
            System.out.println(heap);
//            heapify(heap);
//            System.out.println(heap);
            heapSort(heap);
            System.out.println(heap);
        }
    }
