package com.fooddelievery.list;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ListOperation
{
    public static void main(String[] args) {

           List<Integer> listInteger = Arrays.asList(1,2,3,4);
           int sum=0;
            for(int counter = 0; counter< listInteger.size() ; counter++)
            {
                  sum += listInteger.get(counter);
            }
            System.out.println(sum);
            listInteger.stream().reduce(0 , Integer::sum);

    }

}
