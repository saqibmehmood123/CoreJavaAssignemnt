package com.fooddelievery.threadings.ass18;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class Runner {
    public static void main(String[] args) {
         final ScheduledExecutorService scheduler =
                Executors.newScheduledThreadPool(1);
       scheduler.schedule(new MyThread("Producer") , 1 , TimeUnit.SECONDS);
       scheduler.scheduleAtFixedRate(new MyThread("Producer"), 1, 2, TimeUnit.SECONDS);
        try {
            Thread.sleep(10000); // Let it run for 10 seconds
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        scheduler.shutdown();
    }
}

