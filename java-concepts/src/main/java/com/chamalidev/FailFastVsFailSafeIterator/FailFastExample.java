package com.chamalidev.FailFastVsFailSafeIterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class FailFastExample {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("Alice");
        list.add("Bob");
        list.add("Charlie");

        // create an iterator
        Iterator<String> iterator = list.iterator();

        while (iterator.hasNext()) {
            String name = iterator.next();
            System.out.println(name);

            // simulate concurrent modification
            if (name.equals("Bob")) {
                list.remove(name);
                // This will throw ConcurrentModificationException and Charlie will not be printed
            }
        }
    }
}
