/*
he Java Collections Framework (JCF) is a powerful architecture for storing and manipulating groups of data.
It includes interfaces, implementations (classes), and algorithms.

Main Interfaces in Collections Framework:

Interface   Description	                                Examples of Classes
List	    Ordered collection, duplicates allowed	    ArrayList, LinkedList
Set	        No duplicates, unordered (or sorted)	    HashSet, TreeSet
Queue	    FIFO, used for processing elements	        PriorityQueue, LinkedList
Map     	Key-value pairs	                            HashMap, TreeMap

Map is not part of Collection interface
 */

package org.java101.CollectionsFramework;

import java.util.*;

public class CollectionsFramework {
    public static void main(String[] args) {

    }

    // Ordered collection, duplicates allowed
    public void arrayListExample(){
        List<String> fruits = new ArrayList<>();
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Mango");
        fruits.add("Apple");  // Allows duplicates

        for (String fruit : fruits) {
            System.out.println(fruit);
        }
    }

    public void linkedListExample(){
        LinkedList<String> cities = new LinkedList<>();
        cities.add("London");
        cities.addFirst("New York");
        cities.addLast("Tokyo");

        for (String city : cities) {
            System.out.println(city);
        }
    }

    // No duplicates, unordered (or sorted)
    public void hashSetExample(){
        Set<String> languages = new HashSet<>();
        languages.add("Java");
        languages.add("Python");
        languages.add("Java");  // Duplicate will be ignored

        for (String lang : languages) {
            System.out.println(lang);
        }
    }

    public void treeSetExample(){
        Set<Integer> set = new TreeSet<>();
        set.add(15);
        set.add(5);
        set.add(25);

        System.out.println("Sorted Set: " + set);
    }

    // handles Key-value pairs ex: json file handling
    public void hashMapExample(){
        Map<Integer, String> students = new HashMap<>();
        students.put(101, "Alice");
        students.put(102, "Bob");
        students.put(103, "Charlie");

        for (Map.Entry<Integer, String> entry : students.entrySet()) {
            System.out.println("ID: " + entry.getKey() + ", Name: " + entry.getValue());
        }
    }

    public void treeMapExample(){
        Map<String, Integer> stock = new TreeMap<>();
        stock.put("Banana", 20);
        stock.put("Apple", 30);
        stock.put("Mango", 25);

        for (Map.Entry<String, Integer> entry : stock.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }

    // LIFO, ex: one way road, browser operation back button
    public void stackExample(){
        Stack<String> stack = new Stack<>();
        stack.push("Java");
        stack.push("Python");
        stack.push("C++");

        while (!stack.isEmpty()) {
            System.out.println("Popped: " + stack.pop());
        }
    }

    // FIFO, used for processing elements ex: ticket booking
    public void priorityQueueExample(){
        Queue<Integer> numbers = new PriorityQueue<>();
        numbers.add(42);
        numbers.add(24);
        numbers.add(5);

        while (!numbers.isEmpty()) {
            System.out.println(numbers.poll());  // Elements removed in priority order
        }
    }
}

/*
When to Use What?

Requirement	                        Use This
Ordered, index-based access	        List (ArrayList)
No duplicates, unordered	        Set (HashSet)
Sorted elements	                    TreeSet, TreeMap
Key-value pair storage	Map         (HashMap, TreeMap)
FIFO processing	                    Queue, LinkedList
LIFO processing	                    Stack
 */