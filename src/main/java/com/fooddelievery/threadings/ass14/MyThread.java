package com.fooddelievery.threadings.ass14;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.Semaphore;

public class MyThread implements Runnable {

    private Semaphore semaphore;
    private String threadName;
    ConnectionJdbc connectionJdbc;
    public MyThread(String threadName ,Semaphore semaphore ) {
        this.threadName = threadName;
         this.semaphore = semaphore;

    }


    @Override
    public void run() {
        try {
            this.semaphore.acquire();
            connectionJdbc =    connectionJdbc.creatConnection();

            Thread.sleep(2000);  ///  only demonstratation purposes
            System.out.println( "name of user   " +connectionJdbc.fetchUserName());
            this.semaphore.release();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }

    }

}
