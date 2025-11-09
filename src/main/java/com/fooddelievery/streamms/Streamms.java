package com.fooddelievery.streamms;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

public class Streamms
{

    public static void main(String[] args) {
        List<String> listString = Arrays.asList("zafar","saqib1");

     //   listString.stream().map(String::toUpperCase).forEach(  System.out :: println);
/*

        listString.stream().sorted().forEach(  System.out :: println);

        List<Integer> listInteger = Arrays.asList(3,1);

        Optional<Integer> val =  listInteger.stream().max((a, b) -> { return a-b; } );

        Optional<Integer> val2 =  listInteger.stream().min((a, b) -> { return a-b; } );


        System.out.println(val2.get());
*/

      ///  assignemnt12();
        assignemnt12();

    }
         /// Partition stream elements using Collectors.partitioningBy()

         public static void  assignemnt12()
         {
            ///   Partition stream elements using Collectors.partitioningBy()
             List<String> listString = Arrays.asList("zafar","saqib1" ,"saqib1" ,"naeem" ,"jazba");

              Map< Boolean, Long> stringListMap = listString.stream().collect(Collectors.partitioningBy(
                     str -> str.contains("zafar") || str.contains("saqib") ,
                      Collectors.counting()
             ));

             stringListMap.forEach( (k , v)  ->
                     {
                         System.out.println(k +"  " + v);
                     }
             );

         }

        public static void  assignemnt11()
        {
            ///   Group objects by property using Collectors.groupingBy()
            List<String> listString = Arrays.asList("zafar","saqib1" ,"saqib1" ,"saqib" ,"saqib");

         Map<String , List<String>>  stringListMap  =  listString.stream().collect(Collectors.groupingBy(
                    str -> str
            ) );

            stringListMap.forEach( (k , v)  ->
                    {
                        System.out.println(k +"  " + v);
                    }
                    );

        }

 }
