package com.fooddelievery.threadings.ass15;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.CyclicBarrier;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Runner {
    public static void main(String[] args) {
        CyclicBarrier barrier = new CyclicBarrier(2);
        ExecutorService executor = Executors.newFixedThreadPool(2);
        //Create MyCallable instance
        executor.submit(new MyThread("T1", barrier));
        executor.submit(new MyThread("T2", barrier));
        executor.shutdown();
    }
}

