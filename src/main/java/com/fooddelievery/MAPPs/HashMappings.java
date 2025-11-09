package com.fooddelievery.MAPPs;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.*;
import java.util.stream.Collectors;

public class HashMappings
{
    public static void main(String[] args) throws IOException {

      //  ass1();
      ass15();
    }

    public static void ass15() throws IOException {
        /// 14. Find the first non-repeating character in string using LinkedHashMap
//          File  file = new File("/file.txt");
//        Path filePath = file.toPath();
//        Files.lines(filePath)
//                .map(l -> l.split(" "))
//                .collect(
//                        Collectors.grou
//
//
//                )
        Map<String, Integer>  wordCounte = new HashMap<>();
        try (BufferedReader reader = new BufferedReader(new FileReader("file.txt")))
        {
            String line;
            while ((line = reader.readLine()) != null) {
                processLine( wordCounte , line);
            }
        }
         System.out.println(wordCounte);

    }

    public static void processLine(Map<String, Integer>  wordCounte ,String line)
    {
                  Arrays.stream(line.split(" ")).forEach( s ->
                          {
                              wordCounte.put(s , (wordCounte.getOrDefault(s,0)+1 ));
                          }
                  );
    }
    public static void ass14()
    {
        /// 14. Find the first non-repeating character in string using LinkedHashMap
        String stringInput = "ssaab";
         Map<Character , Integer> nonRpeating = new LinkedHashMap<>();
         for(char achar : stringInput.toCharArray())
         {
             nonRpeating.put(achar , (nonRpeating.getOrDefault(achar,0)+1));
         }

     char first =      nonRpeating.entrySet().stream().filter( (k ->
        {
            if(k.getValue()==1)
                return true;
           return false;
        })).findFirst().get().getKey();
         System.out.println(first);
}


    public static void ass13()
    {
       /// 13. Group objects by a property using Map (e.g., group employees by department)

        Employee  em = new Employee(1, "saqib" , "CS");
        Employee  em2 = new Employee(2, "ALI" , "CS");
        Employee  em3 = new Employee(3, "HUSSAIN" , "MATH");
        Employee  em4 = new Employee(4, "saqib" , "CHEM");


        List<Employee>  employeeList = new ArrayList<>();
        employeeList.add(em);
        employeeList.add(em2);
        employeeList.add(em3);
        employeeList.add(em4);

      Map<String , List<Employee>>   listEmployee  =     employeeList.stream().collect( Collectors.groupingBy((
                emp  -> emp.getDepartment()

        )) ) ;


         System.out.println(listEmployee);



    }



    public static void ass12()
    {
        //Create a nested Map structure (Map<String, Map<String, Integer>>)
        LruCache  lruCache = new LruCache();

        lruCache.put(1,1);
        lruCache.put(2,2);
        lruCache.get(2);
        lruCache.put(3,3);

        lruCache.forEach(
                (k  ,  v) ->
                {
                    System.out.println(k +  " " + v);
                }

        );

        System.out.println();




    }



    public static void ass11()
    {
        //Create a nested Map structure (Map<String, Map<String, Integer>>)
        Student s1 = new Student(1, "a");
        Student s2 = new Student(1, "a");
        Student s3 = new Student(3, "a");
        Map<Student ,Integer> integerTreeMap = new HashMap<>();
        integerTreeMap.put(s1,1);
        integerTreeMap.put(s3,1);
        integerTreeMap.put(s2,1);
       System.out.println(" size is " + integerTreeMap.size());
   }


    public static void ass10()
    {
        //Create a nested Map structure (Map<String, Map<String, Integer>>)
        Map<String ,Integer> integerTreeMap = new HashMap<>();
        integerTreeMap.put("a",1);
        integerTreeMap.put("b",13);

        Map<String, Map<String, Integer>>  nestedMap = new HashMap<>();
        nestedMap.put("nest1" , integerTreeMap);






    }



    public static void ass9()
    {

        Map<Integer ,Integer> integerTreeMap = new HashMap<>();
        integerTreeMap.put(3,1);
        integerTreeMap.put(2,13);   //// this is our target

        Map<Integer ,Integer> integerTreeMap2 = new HashMap<>();
        integerTreeMap2.put(3,1);
        integerTreeMap2.put(2,13);   //// this is our target



        System.out.println(integerTreeMap2.equals(integerTreeMap));


    }


    public static void ass8()
    {
        /// / left
        Map<Integer ,Integer> integerTreeMap = new HashMap<>();
        integerTreeMap.put(3,1);
        integerTreeMap.put(2,13);   //// this is our target

        Map<Integer ,Integer> integerTreeMap2 = new HashMap<>();
        integerTreeMap2.put(3,1);
        integerTreeMap2.put(2,13);   //// this is our target



        System.out.println(integerTreeMap2.equals(integerTreeMap));


    }



    public static void ass7()
    {

        /// ///////////  left
        Map<Integer ,Integer> integerTreeMap = new TreeMap<>();
        integerTreeMap.put(3,1);
        integerTreeMap.put(2,13);   //// this is our target
        integerTreeMap.put(1,2);

        Map.Entry<Integer, Integer> integerTreeMap1    =      integerTreeMap.entrySet().stream().max(Map.Entry.comparingByValue()).get();


        System.out.println(integerTreeMap1.getKey());


    }



    public static void ass6()
    {

        String frequency = "saqib saqib bb aa";
        Map<Character ,Integer> frequncyCountMap = new LinkedHashMap<>();



            for(char charecter : frequency.   toCharArray())
            {
                frequncyCountMap.put(charecter , (frequncyCountMap.getOrDefault(charecter , 0) +1));

            }

        frequncyCountMap.forEach((k,v) ->System.out.println(k  + "  " + v));
    }

    public static void ass5()
    {
        Map<Integer ,Integer> integerMap = new HashMap<>();
        integerMap.put(1,2);
        integerMap.put(2,3);
        integerMap.put(3,2);

        Iterator<Integer>  iterator  =  integerMap.values().iterator();

        while(iterator.hasNext())
        {
            if(iterator.next()%2 == 0 )
            {
                iterator.remove();
            }
        }




    }

    public static void ass4()
    {
        Map<Integer ,Integer> integerMap = new HashMap<>();
        integerMap.put(1,2);
        integerMap.put(2,3);
        integerMap.put(3,2);
        Map<Integer ,Integer> integerMapCopy = new HashMap<>();
        integerMapCopy.putAll(integerMap);
}

    public static void ass3()
    {
        Map<Integer ,Integer> integerMap = new HashMap<>();
        integerMap.put(1,2);
        integerMap.put(2,3);
        integerMap.put(3,2);
        System.out.println(integerMap.containsKey(1));
        System.out.println(integerMap.containsValue(3));


    }

    public static void ass2()
    {
        Map<Integer ,Integer> integerMap = new HashMap<>();
        integerMap.put(1,2);
        integerMap.put(2,3);
        integerMap.put(3,2);
                   for(Map.Entry<Integer ,Integer> entry : integerMap.entrySet())
                   {
                       System.out.println(entry.getKey() + "  " + entry.getValue());
                   }
    }



    public static void ass1()
    {
        Map<Integer ,Integer> integerMap = new HashMap<>();
        integerMap.put(1,2);
        integerMap.put(2,3);
        integerMap.put(3,2);

       System.out.println(integerMap.get(3));

           integerMap.remove(2);

        System.out.println(integerMap.get(2));




    }

    }
