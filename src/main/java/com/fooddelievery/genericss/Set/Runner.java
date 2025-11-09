package com.fooddelievery.genericss.Set;

import com.fooddelievery.genericss.Student;

public class Runner
{

    public static void main(String[] args) {
        OwnSet<String> stringOwnSet  = new OwnSet<>();
        stringOwnSet.add("ali khan");
        stringOwnSet.add("ali khan");


        stringOwnSet.add("saqib");
        stringOwnSet.add("FAISAL");
        stringOwnSet.add("NAEEM");
        stringOwnSet.add("arfa");

        stringOwnSet.add("arfa");

        stringOwnSet.add("arfa");

        stringOwnSet.add("arfa");

        stringOwnSet.add("arfa");

        stringOwnSet.add("arfa");

        stringOwnSet.add("arfa");


       stringOwnSet.print();
      ////  System.out.println(stringOwnSet.get());

        OwnSet<Integer> intOwnSet  = new OwnSet<>();
        intOwnSet.add(45);
        intOwnSet.add(45);
        intOwnSet.add(45);
        intOwnSet.print();

        Student s = new Student(1);
        Student s2 = new Student(11);
        Student s3 = new Student(1);
        OwnSet<Student> stOwnSet  = new OwnSet<>();
        stOwnSet.add(s);
        stOwnSet.add(s2);
        stOwnSet.add(s3);
        stOwnSet.print();





    }

}
