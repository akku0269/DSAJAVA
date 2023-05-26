package Deque;


import java.util.*;

public class DequeSTL {
    public static void main(String[] args) {
        Deque<Integer> dq = new LinkedList<>();
//        dq.addLast(1);
//        dq.addLast(2);
//        dq.addLast(3);
//        dq.addLast(4);
//        System.out.println(dq);
//        dq.addFirst(5);
//        System.out.println(dq);
//        dq.removeLast();
//        System.out.println(dq);
//        dq.removeFirst();
//        System.out.println(dq);
//        System.out.println(dq.getFirst());
//        System.out.println(dq.getLast());

        dq.addLast(1);
        dq.addLast(2);
        dq.addLast(3);
        dq.addLast(1);
        dq.add(5);  // last add
     //   dq.remove(); // first remove
     //   dq.removeAll(dq);  // removes everything
        System.out.println(dq);
        dq.removeFirstOccurrence(1);
        System.out.println(dq);
     //   dq.removeLastOccurrence(1);
        System.out.println(dq);
    }
}
