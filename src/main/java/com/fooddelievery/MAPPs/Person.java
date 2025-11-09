package com.fooddelievery.MAPPs;

public class Person
{
   private int id;


    public Person(int id) {
        this.id = id;
        System.out.println("  super-class conscrticter ,   person ");

    }

    public int getIdD() {
        System.out.println(" this is getId  of base classs ,Person   ");
        return 5;
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
