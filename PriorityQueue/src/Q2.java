import java.util.*;

// You are given a set of points in a XY plane. You need to find the k closest points to the origin using
//manhattan distance.
//It is guaranteed that no 2 points will have the same distance from the origin.
public class Q2 {

    private static class Point {
        int x;
        int y;
        int distance;

        Point(int x, int y) {
            this.x = x;
            this.y = y;
        }
    }

    private static class PointComperator implements Comparator<Point> {
        public int compare(Point p1, Point p2) {
            if (p1.distance > p2.distance) {
                return -1;
            }else{
                return 1;
            }

        }
    }


    public static ArrayList<Point> kClosestPoints(ArrayList<Point> pts , int n ,int k){
            PriorityQueue<Point> pq = new PriorityQueue<>(new PointComperator());
            for(int i=0; i <n; i++){
                pts.get(i).distance = pts.get(i).x + pts.get(i).y;
                pq.add(pts.get(i));
                if(pq.size() > k){
                    pq.poll();
                }
            }
            return new ArrayList<>(pq);
        }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter no. of Points");
        int n = sc.nextInt();
        System.out.println("Enter how many points you want to find which has smaller distance");
        int k = sc.nextInt();
        ArrayList<Point> pts = new ArrayList<>();
        System.out.println("Enter points");
        for(int i = 0; i<n; i++){
            pts.add(new Point(sc.nextInt(),sc.nextInt()));
        }
        pts = kClosestPoints(pts,n,k);
        for(int i=0 ; i<k ; i++){
            System.out.println(pts.get(i).x + " " + pts.get(i).y);
        }
    }

}