package com.fooddelievery.threadings.ass21;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class
Runner {
    public static void main(String[] args) throws InterruptedException {

        AtomicCounter refrence  =  new  AtomicCounter();

         final ExecutorService scheduler =  Executors.newFixedThreadPool(2);
         scheduler.submit(new MyThread("First-Thread",refrence) );
         scheduler.submit(new MyThread("Second-Thread",refrence) );
           Thread.sleep(1000);

         scheduler.shutdown();




    }
}

