import java.util.ArrayDeque;
import java.util.Collection;
import java.util.Iterator;
import java.util.Queue;

public class BasicSTL {
    public static void main(String[] args) {
        Queue<Integer> q = new ArrayDeque<>();    // ArrayDeque ki jagah LinkedList bhi likh sakte hai.
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);
        System.out.println(q.size());
        System.out.println(q);
        q.remove();
        System.out.println(q);
        q.poll();
        System.out.println(q);
        System.out.println(q.element());
        System.out.println(q.peek());
    }
}
