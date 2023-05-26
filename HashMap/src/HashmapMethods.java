import java.util.*;

public class HashmapMethods {
    public static void main(String[] args) {

        Map<String, Integer> mp = new HashMap<>();
        // Adding Elements
        mp.put("Akash", 21);
        mp.put("Yash", 16);
        mp.put("Aman", 22);
        mp.put("Harry", 18);
        // Getting value of a key from the hashmap
        System.out.println(mp.get("Yash")); // 16
        System.out.println(mp.get("Rahul")); // null
        // Changing/Updating value of a key in the HashMap
        mp.put("Akash", 25);
        System.out.println(mp.get("Akash"));
        // Removing a pair from the HashMap
        mp.remove("Akash");
        // Checking if a key is in the HashMap
        System.out.println(mp.containsKey("Yash"));
        System.out.println(mp.containsKey("Akash"));
        // Adding a new entry only if the new key doesn't exist already
        mp.putIfAbsent("Aryan", 30);
        mp.putIfAbsent("Yash", 30);
        // Get all values in the HAshMap
        System.out.println(mp.keySet());
        // Get all values in the HAshMap
        System.out.println(mp.values());
        // Get all entries in the HAshMap
        System.out.println(mp.entrySet());
        // traversing all entries of HashMap - Multiple methods
        for(String key : mp.keySet()){
            System.out.printf("Age of %s is %d\n",key,mp.get(key));
        }
        System.out.println();
        for(Map.Entry<String,Integer> e : mp.entrySet()){
            System.out.printf("Age of %s is %d\n",e.getKey(),e.getValue());
        }
        System.out.println();
        for(var e : mp.entrySet()){
            System.out.printf("Age of %s is %d\n",e.getKey(),e.getValue());
        }
    }
    }

