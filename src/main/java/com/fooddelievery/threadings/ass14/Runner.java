package com.fooddelievery.threadings.ass14;

import java.util.concurrent.*;

public class Runner {
    public static void main(String[] args) {
        /*for(int i=1;i<=5;i++){
            if(i==3)
            {
                continue;
            }


            System.out.print(i);

        }*/

        ScheduledExecutorService scheduler  = Executors.newScheduledThreadPool(1);



        Semaphore  semaphore = new Semaphore(1);   ////  only 1 thread can aacess resource , databse connectiosn and operations

        ExecutorService executor = Executors.newFixedThreadPool(2);
        //Create MyCallable instance

        executor.submit(new MyThread("T1" , semaphore));
        executor.submit(new MyThread("T2", semaphore));

        try {

        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        executor.shutdown();
    }
}

