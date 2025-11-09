package com.fooddelievery.threadings.ass13;

import java.util.concurrent.Callable;
import java.util.concurrent.CountDownLatch;

public class MyThread implements Callable<Integer> {

    private String threadName;
    private Integer subTotal = 0;
    private int upperBound;
 private CountDownLatch countDownLatch;

    public MyThread(String threadName, int upperBound,CountDownLatch countDownLatch) {

        this.threadName = threadName;
        this.upperBound = upperBound;
        this.countDownLatch = countDownLatch;
    }

    @Override
    public Integer call() throws Exception {
        try {
            for (int counter = 0; counter < upperBound; counter++) {
                this.subTotal += counter;
            }

        } catch (Exception e) {
            System.out.println("  exception " + e);
        }
        countDownLatch.countDown();
        return this.subTotal;
    }
}
