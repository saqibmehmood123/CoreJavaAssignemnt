package com.fooddelievery.threadings.ass16;

import java.util.HashMap;

public class Cache {

    HashMap<Integer, Integer> cache;

    public Cache() {
        cache = new HashMap<>();
        cache.put(100, 100);
    }

    public void writeToCache(Integer key, Integer value) {
        cache.put(key, value);
    }

    public void readeFromCache() {
        cache.entrySet().stream().forEach(
                (entrySet) ->
                {
                    System.out.print(entrySet.getValue() + "   ");
                }

        );
        System.out.print("   ");
    }


}
