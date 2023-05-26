import java.util.HashMap;
import java.util.LinkedList;

public class HashMapImplementation {

    static class MyHashMap<K,V>{
        public static final int DEFAULT_CAPACITY = 4;
        public static final float DEFAULT_LOAD_FACTOR = 0.75f;
        private class Node{
            K key;
            V value;
            Node(K key , V value){
                this.key = key;
                this.value = value;
            }

        }

        private int n;  // no. of the entries in map
        private LinkedList<Node>[] buckets;


        private void initBuckets(int N){ // N - capacity/size of buckets array
            buckets = new LinkedList[N];
            for(int i =0 ; i< buckets.length ; i++){
                buckets[i] = new LinkedList<>();
            }
        }

        private  int searchInBucket(LinkedList<Node> ll ,K key){
            for(int i =0 ; i<ll.size() ; i++){
                if(ll.get(i).key == key){
                    return i;
                }
            }
            return -1;
        }

        public MyHashMap(){
            initBuckets(DEFAULT_CAPACITY);
        }

        public int capacity(){
            return buckets.length;
        }

        public float load(){
            return (n*1.0f)/buckets.length;
        }

        private void rehash(){
            LinkedList<Node>[] oldBuckets = buckets;
            n = 0 ;
            initBuckets(oldBuckets.length * 2);
            for(var buckets : oldBuckets){
                for(var node : buckets){
                    put(node.key , node.value);
                }
            }
        }

        public int size(){  // return the entries in map
            return n;
        }

        private int HAshFunc(K key){
            int hc = key.hashCode();
            return (Math.abs(hc)) % buckets.length;
        }

        public void put(K key , V value){  // insert / update
            int bi = HAshFunc(key);
            LinkedList<Node> currBucket = buckets[bi];
            int ei = searchInBucket(currBucket,key);
            if(ei == -1){ // key doesn't exist , we have to insert a new node
                Node node = new Node(key,value);
                currBucket.add(node);
                n++;
            }else {
                Node currNode = currBucket.get(ei);
                currNode.value = value;
            }
            if(n>= buckets.length * DEFAULT_LOAD_FACTOR){
                rehash();
            }
        }

        public V get(K key){
            int bi = HAshFunc(key);
            LinkedList<Node> currBucket = buckets[bi];
            int ei = searchInBucket(currBucket,key);
            if(ei!=-1){ // key exist
                Node currNode = currBucket.get(ei);
                return currNode.value;
            }
            // key doesn't exist;
            return null;
        }

        public V remove(K key){
            int bi = HAshFunc(key);
            LinkedList<Node> currBucket = buckets[bi];
            int ei = searchInBucket(currBucket,key);
            if(ei!=-1){ // key exists
                Node currNode = currBucket.get(ei);
                V val = currNode.value;
                currBucket.remove(ei);
                n--;
                return val;
            }
            // key doesn't exist;
            return null;
        }
    }

    public static void main(String[] args) {
        MyHashMap< String , Integer > mp = new MyHashMap<>();
        MyHashMap< String , String > mp2 = new MyHashMap<>();
        System.out.println("Testing put");
        mp.put("a",1);
        mp.put("b",2);
        mp.put("c",3);
        mp.put("x",61);
        mp.put("y",71);
        System.out.println("Testing size : " + mp.size());
//        mp.put("c",30);
//        System.out.println("Testing size : " + mp.size());
//
//        // testing get
//        System.out.println(mp.get("a")); // 1
//        System.out.println(mp.get("b")); // 2
//        System.out.println(mp.get("c")); // 30
//        System.out.println(mp.get("college")); // null
//
//
//        System.out.println(mp.remove("c")); // 30
//        System.out.println(mp.remove("c")); // null
//        System.out.println("Testing size : "+mp.size()); // 2

        System.out.println(mp.get("x"));
        System.out.println(mp.get("y"));

        System.out.println("Capacity : "+ mp.capacity()); // 8
        System.out.println("Load : " + mp.load()); // < 0.75
    }
}
