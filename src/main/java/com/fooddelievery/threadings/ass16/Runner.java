package com.fooddelievery.threadings.ass16;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Semaphore;
import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

public class Runner {
    public static void main(String[] args) {

        ReadWriteLock lock = new ReentrantReadWriteLock();
         Cache cache = new Cache();
        ExecutorService executor = Executors.newFixedThreadPool(3);
        //Create MyCallable instance
        executor.submit(new MyThread("Writer", lock,cache));
        executor.submit(new MyThread("Reader1" , lock,cache));
        executor.submit(new MyThread("Reader2", lock,cache));
        executor.submit(new MyThread("Reader3" , lock,cache));



        try {
           Thread.sleep(1000);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        executor.shutdown();
    }
}

