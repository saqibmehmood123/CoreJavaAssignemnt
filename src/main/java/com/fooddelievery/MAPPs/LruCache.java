package com.fooddelievery.MAPPs;

import java.util.LinkedHashMap;
import java.util.Map;

public class LruCache extends LinkedHashMap<Integer, Integer>
{
    final  static int capacity = 2;


    public LruCache()
    {
        super(capacity, 0.75f, true); // Use super(), not separate map
    }






    @Override
    protected boolean removeEldestEntry(Map.Entry eldest) {
        System.out.println("  this is removeEldestEntry ");
        return size() >capacity;
    }
}
