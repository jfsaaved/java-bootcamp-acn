package org.accenture.day04.lessons;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Lesson01HashMapLists {
    public Lesson01HashMapLists() {
        HashMap<String, Integer> ages = new HashMap<>();

        ages.put("Alice", 25);      // Add key-value pair
        ages.put("Bob", 30);
        ages.put("Charlie", 20);

        System.out.println(ages.get("Bob")); // 30
        ages.remove("Charlie");             // remove key
        System.out.println(ages.containsKey("Alice")); // true

        ArrayList<String> fruits = new ArrayList<>();

        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Cherry");

        System.out.println(fruits.get(1));  // Banana
        fruits.set(1, "Blueberry");         // Replace Banana
        fruits.remove(0);                   // Remove Apple
    }
}
