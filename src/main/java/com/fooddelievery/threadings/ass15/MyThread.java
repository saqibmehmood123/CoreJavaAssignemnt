package com.fooddelievery.threadings.ass15;

import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.CyclicBarrier;

public class MyThread implements Runnable {

    CyclicBarrier barrier; // Split image into 4 parts


    private String threadName;

    public MyThread(String threadName, CyclicBarrier barrier) {
        this.threadName = threadName;

        this.barrier = barrier; // Store it!

    }


    @Override
    public void run() {
        try {
            devideImageIntoChucnks(this.threadName);
            this.barrier.await();
            System.out.println("i will wait here untill");
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        mergeImageIntoChucnks(this.threadName);

    }

    private void mergeImageIntoChucnks(String threadName) {
        System.out.println(threadName + " is merging image into 1 big  chunks");
    }

    private void devideImageIntoChucnks(String threadName) {
        System.out.println(threadName + " is deviding image into small chunks");
    }

}
