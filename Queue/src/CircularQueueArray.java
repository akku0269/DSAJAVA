public class CircularQueueArray {

    public static class CircularQueue{
        int f = -1;  // front
        int r = -1;  // rear
        int size = 0;
        int[] arr = new int[5];

        void add(int val) throws Exception{
            if(size==arr.length){
               throw new Exception("Queue is Full!");
            } else if (size == 0) {
                f = r = 0;
                arr[0] = val;
            } else if (r < arr.length - 1) {
                arr[++r] = val;
            } else if (r==arr.length-1) {
                r = 0;
                arr[0] = val;
            }
            size++;
        }

        void remove() throws Exception{
            if(size==0){
                throw new Exception("Queue is Empty!");
            } else {
                int val = arr[f];
                if(f==arr.length-1) f =0;
                else f++;
                size--;
            }
        }

        int peek() throws Exception{
            if(size==arr.length){
                throw new Exception("Queue is Full!");
            }
            else return arr[f];
        }

        boolean isEmpty(){
            if(size==0) return true;
            else return false;
        }

        void display(){
            if(size==0){
                System.out.println("Queue is Empty!");
                return;
            } else if (f <= r) {
                for(int i = f ; i<=r; i++){
                    System.out.print(arr[i]+" ");
                }
            }
            else{ // rear<front
                for(int i = f ; i<arr.length; i++){
                    System.out.print(arr[i]+" ");
                }
                for(int i = 0 ; i<=r; i++){
                    System.out.print(arr[i]+" ");
                }
            }
            System.out.println();
        }
    }

    public static void main(String[] args) throws Exception{
        CircularQueue q = new CircularQueue();
        q.display();
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.display(); // 1 2 3 4
        q.remove();
        q.display(); //   2 3 4
        q.add(5);
        q.display(); //   2 3 4 5
        q.add(6);
        q.display();
        for(int i =0 ;i<q.arr.length;i++){
            System.out.print(q.arr[i]+" ");
        }
    }
}
