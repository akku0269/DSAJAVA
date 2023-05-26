public class LinkedListImplementation {

    public static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
        }
    }

    public static class linkedList {
        Node head = null;
        Node tail = null;
        int size = 0;

        void insertAtEnd(int val) {
            Node temp = new Node(val);
            if (head == null) {
                head = temp;
            } else {
                tail.next = temp;
            }
            tail = temp; // ye statement if aur else dono me aaega krke bahr likhe hai
            size++;
        }

        void insertAtBeginning(int val) {
            Node temp = new Node(val);
            if (head == null) { // empty list
            //    insertAtEnd(val);
                head = temp;
                tail = temp;
            } else {
                temp.next = head;
                head = temp;
            }
            size++;
        }

        void insertAt(int idx, int val) {
            Node t = new Node(val);
            Node temp = head;
            if (idx == size) {
                insertAtEnd(val);
                return;
            } else if (idx == 0) {
                insertAtBeginning(val);
                return;
            } else if (idx > size || idx < 0) {
                System.out.println("Wrong index");
                return;
            }
            for (int i = 1; i <= idx - 1; i++) {
                t.next = temp.next;
                temp.next = t;
            }
            size++;
        }

        int getAt(int idx) {
            Node temp = head;
            for (int i = 1; i <= idx; i++) {
                temp = temp.next;
            }
            return temp.data;
        }

        void deleteAtIdx(int idx){
            Node temp = head;
            if(idx==0){
                head = head.next;
                size--;
                return;
            }
            for(int i=1 ;i<=idx-1 ; i++){
                temp = temp.next;
            }
            temp.next = temp.next.next;
            tail = temp;
            size--;
        }

        void display() {
            Node temp = head;
            while (temp != null) {
                System.out.print(temp.data + " ");
                temp = temp.next;
            }
            System.out.println();
        }
    }
        public static void main(String[] args) {
            linkedList ll = new linkedList();
            ll.insertAtEnd(4);
            ll.display();

            ll.insertAtBeginning(13);
            ll.display();

            ll.insertAtEnd(10);
            ll.display();

            ll.insertAt(2, 3);
            ll.display();

            ll.insertAt(0, 7);
            ll.display();

            ll.deleteAtIdx(0);
            ll.display();

            System.out.println("getAt:"+ll.getAt(3));

          //  System.out.println(ll.tail.data);
          //  System.out.println("size of linked list: " + ll.size);
        }
    }


