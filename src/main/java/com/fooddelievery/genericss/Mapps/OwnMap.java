package com.fooddelievery.genericss.Mapps;

public class OwnMap<K, V> {
    private static final int SIZE = 10;
    private Entry<K, V>[] table;

    // Constructor
    @SuppressWarnings("unchecked")
    public OwnMap() {
        table = new Entry[SIZE];
    }

    // Put key-value pair
    public void put(K key, V value) {
        int index = Math.abs(key.hashCode() % SIZE);
     //   System.out.println(index +  " index  :::   hashCode   " + key.hashCode());
        Entry<K, V> newEntry = new Entry<>(key, value);

        if (table[index] == null)
        {
            table[index] = newEntry;
            System.out.println("  this is if part  ");
        } else {
            System.out.println("  this is else part  ");
            Entry<K, V> current = table[index];
            while (current.next != null) {
                if (current.key.equals(key)) {
                    current.value = value; // Update existing
                    return;
                }
                current = current.next;
            }
            current.next = newEntry;
        }
    }

    // Get value by key
    public V get(K key) {
        int index = Math.abs(key.hashCode() % SIZE);
        Entry<K, V> current = table[index];

        while (current != null) {
            if (current.key.equals(key)) {
                return current.value;
            }
            current = current.next;
        }
        return null;
    }

    // Check if key exists
    public boolean containsKey(K key) {
        return get(key) != null;
    }
}