package com.fooddelievery.threadings.ass19;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class
Runner {
    public static void main(String[] args) {

        SingltonPatteren refrence = SingltonPatteren.createObject();

         final ExecutorService scheduler =  Executors.newFixedThreadPool(2);
         scheduler.submit(new MyThread("First-Thread", refrence) );
         scheduler.submit(new MyThread("Second-Thread", refrence) );
         scheduler.shutdown();




    }
}

