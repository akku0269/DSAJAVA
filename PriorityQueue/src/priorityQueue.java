import java.util.*;

public class priorityQueue {

    private static class Student {
        String name;
        Integer rollNo;
        String dob;
        Integer marks;
    }

    private static class StudentComparator implements Comparator<Student> {
        // overriding
        public int compare(Student s1, Student s2) {
            if (s1.marks > s2.marks) {
                return -1;
            } else if (s1.marks < s2.marks) {
                return 1;
            } else {
                if (s1.rollNo > s2.rollNo) {
                    return 1;
                } else if (s1.rollNo < s2.rollNo) {
                    return -1;
                } else {
                    return 0;
                }
            }
        }}

        public static void main(String[] args) {
            List<Student> students = new ArrayList<>();
            PriorityQueue<Student> studentsPriorityQueue = new PriorityQueue<>(new StudentComparator());

            Student harsh = new Student();
            harsh.name = "Harsh";
            harsh.rollNo = 14;
            harsh.dob = "12-10-2001";
            harsh.marks = 97;
            studentsPriorityQueue.add(harsh);

            Student raghav = new Student();
            raghav.name = "raghav";
            raghav.rollNo = 19;
            raghav.dob = "05-12-2000";
            raghav.marks = 99;
            studentsPriorityQueue.add(raghav);

            System.out.println(studentsPriorityQueue.peek().name);
            System.out.println(studentsPriorityQueue.peek().rollNo);
            System.out.println(studentsPriorityQueue.peek().marks);


            PriorityQueue<Integer> pq = new PriorityQueue<>(); // min heap
            //  PriorityQueue<Integer> pq = new PriorityQueue<>(Comparator.reverseOrder()); // max heap

            pq.add(10);
            pq.add(20);
            pq.add(15);
            pq.add(5);

            //      System.out.println(pq.peek());
        }
    }
