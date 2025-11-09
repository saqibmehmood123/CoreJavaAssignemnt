package com.fooddelievery.threadings.ass12;

import java.util.concurrent.Callable;

public class MyThread implements Callable<Integer> {

    private String threadName;
    private Integer subTotal = 0;
    private int upperBound;

    public MyThread(String threadName, int upperBound) {

        this.threadName = threadName;
        this.upperBound = upperBound;
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

        return this.subTotal;
    }
}
