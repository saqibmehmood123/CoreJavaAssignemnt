package com.fooddelievery.genericss;



// Generic method in regular class
public class Utility {
    // Generic method - <T> before return type
    public static <T> void printArray(T[] array) {
        for (T item : array) {
            System.out.print(item + " ");
        }
        System.out.println();
    }

    // Multiple type parameters
    public static <K, V> void printPair(K key, V value) {
        System.out.println(key + " -> " + value);
    }

    public static void main(String[] args) {

    /*    String[] names = {"Alice", "Bob"};
        Integer[] numbers = {1, 2, 3};

        Utility.<String>printArray(names);  // Explicit type
        Utility.printArray(numbers);        //
    */
        Student[] names = {new Student(45),new Student(45)};
        Utility.printArray(names);
    }

}