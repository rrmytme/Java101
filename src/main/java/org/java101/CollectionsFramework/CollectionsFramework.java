// Java has built-in data structures like ArrayList, HashMap, and HashSet.

package org.java101.CollectionsFramework;

import java.util.*;

public class CollectionsFramework {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("Java");
        list.add("Python");
        list.add("C++");

        for (String lang : list) {
            System.out.println(lang);
        }
    }
}