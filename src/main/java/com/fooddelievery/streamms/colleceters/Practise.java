package com.fooddelievery.streamms.colleceters;

import java.util.*;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.Collectors;

import static java.util.stream.Collectors.*;

public class Practise
{
    public static void main(String[] args) {
        ///m1();
     ///   m2();
///        m3();
      //  m4();

        String s="Java"; String t="Java1";
        System.out.print(s==t);


    }

       public static void m1()
       {
           List<Integer> numbers = Arrays.asList(10, 20);

         double d =    numbers.stream().collect(Collectors.averagingDouble( num -> num ) );

         System.out.println(d);



       }
    public static void m2()
    {
       List<Product> products = Arrays.asList(
                new Product("Laptop", 10),
                new Product("Laptop", 20),
                new Product("Phone", 20),
                new Product("Tablet", 10),
                new Product("Tablet", 10)
        );


 /*
     double doubleAver =    products.stream().filter( product -> product.getName().equals("Tablet")).collect(Collectors.averagingDouble(
                 Product::getPrice
        ));
        System.out.println(doubleAver);
*/

Map<String, Double> e = products.stream().collect(groupingBy(Product::getName, Collectors.averagingDouble(Product::getPrice)));
          e.forEach( (name, average) ->  {System.out.println(name + "  " + average); }  );

    }
    public static void m3()
    {
        List<Person> people = Arrays.asList(
                new Person("John", 25, "NY"),
                new Person("John", 55, "NY"),
                new Person("Jane", 30, "NY"),
                new Person("Jane", 70, "NY"),
                new Person("Bob", 28, "CA"),
                new Person("Alice", 41, "CA"),
        new Person("John", 53, "NY")
        );



// Your code here: Group by city, calculate average age, and format as "City: Average Age"


/*
        Map<String, Long> highEarnersByDept = employees.stream()
                .collect(groupingBy(
                        Employee::getDepartment,
                        filtering(e -> e.getSalary() > 70000, counting())
                ));*/


    }
    public static void m4()
    {
        List<String> stringList = new ArrayList<>();
        stringList.add("saq");
        stringList.add("b");
        stringList.add("saq");
        stringList.add("b");
        stringList.add("a");


     Map<String , Long>  frequency =     stringList.stream().collect( Collectors.groupingBy( str -> str  , Collectors.counting()   ) );
   System.out.println(frequency);

    }

}
