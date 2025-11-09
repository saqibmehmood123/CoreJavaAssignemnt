package com.fooddelievery.threadings.ass6;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingDeque;

public class NumberShared {

    BlockingQueue<Integer> blockingQueue = new LinkedBlockingDeque<>(1);
    private int counter = 0;

    public void put(String name) throws InterruptedException {
        blockingQueue.put(counter);
        counter++;

        System.out.println(name + " has produced number " + counter);

    }

    public Integer get() throws InterruptedException {

        return blockingQueue.take();
    }

    public int getCounter() {
        return counter;
    }
}
