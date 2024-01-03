package Collections;

import java.util.*;

/*
Collection Hierarchy -
1. Iterable - https://media.geeksforgeeks.org/wp-content/cdn-uploads/20200811210521/Collection-Framework-1.png
2. Map - https://lh4.googleusercontent.com/io6wTiFSn668hT9Y5dbvMy2wHR6T5z0aE0qUwA4idlgBeNLfQgMBRC6W1HJHyHQTzZI0PqzgCHbYiBO5O5OQapfZ5VygCSWyoWwarithx31i2wHYxyvrFR9FkZ0t4AesogcEegg
 */

public class CollectionsDemo {
    public static void analyseList(List<String> list) {
        list.add("Agartala");
        list.add("Bangalore");
        list.add("Delhi");
        list.add("Vellore");
        System.out.println(list);
        System.out.println("=====================");
    }

    public static void analyseSet(Set<String> set) {
        set.add("Agartala");
        set.add("Bangalore");
        set.add("Delhi");
        set.add("Vellore");
        System.out.println(set);
        System.out.println("=====================");
    }

    public static void analyseMap(Map<String, Integer> map) {
        map.put("Agartala", 20);
        map.put("Vellore", 4);
        map.put("Bangalore", 2);
        map.put("Delhi", 1);
        System.out.println(map);
        System.out.println("=====================");
    }

    public static void main(String[] args) {

        //List Interface - Memory Efficient than traditional arrays

        // ArrayList
        // Internal implementation - Dynamic Array
        analyseList(new ArrayList<>());

        // LinkedList
        // Internal implementation - DLL
        analyseList(new LinkedList<>());


        // Map Interface
        // HashMap

        // LinkedHashMap

        // TreeMap

        // Set Interface - Non-duplicate values only

        // HashSet - Order not maintained
        // Internal Implementation - HashTable
        // Add- TC: O(N) Contains- TC: O(N) Remove- TC:O(N)
        analyseSet(new HashSet<>());

        // LinkedHashSet - Order Maintained
        // Internal Implementation - DLL + HashTable
        // Add- TC: O(N) Contains- TC: O(N) Remove- TC:O(N)
        analyseSet(new LinkedHashSet<>());

        // TreeSet
        // Internal implementation - Balanced BST - Red Black Trees
        // Add- TC: O(log(N)) Contains- TC: O(log(N)) Remove- TC: O(log(N))


        // Queue

        // PriorityQueue
        // Internal Implementation - Heaps
        // Add- TC: O(log(N)) Contains- TC:  Remove- TC: O(log(N))
        PriorityQueue<Cities> priorityQueue = new PriorityQueue<Cities>();


    }
}
