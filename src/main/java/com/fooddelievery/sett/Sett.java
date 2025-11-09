package com.fooddelievery.sett;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class Sett
{

    public static void main(String[] args) {

      /// /////Remove all elements from a Set that exist in another Set

        Set<Integer> integerSet =  new HashSet<>();
        integerSet.add(1);
        integerSet.add(21);
        integerSet.add(3);

        Set<Integer> integerSet1 =  new HashSet<>();
        integerSet1.add(1);
        integerSet1.add(2);
        integerSet1.add(3);

        integerSet.removeAll(integerSet1);
        System.out.println(integerSet);

    }
}
