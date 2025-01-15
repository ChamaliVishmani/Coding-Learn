package com.chamalidev.FailFastVsFailSafeIterator;

import java.util.Iterator;
import java.util.concurrent.ConcurrentHashMap;

public class FailSafeExample {
    public static void main(String[] args) {
        ConcurrentHashMap<Integer, String> map = new ConcurrentHashMap<>();
        map.put(1, "one");
        map.put(2, "two");
        map.put(3, "three");

        //create an iterator
        Iterator<Integer> iterator = map.keySet().iterator();

        while (iterator.hasNext()) {
            Integer key = iterator.next();
            System.out.println(key);

            // simulate concurrent modification (no exception thrown)
            if (key == 2) {
                map.put(4, "four");
            }
        } // prints 1 2 3 4
    }
}
