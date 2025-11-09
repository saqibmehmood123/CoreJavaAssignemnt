package com.fooddelievery.threadings.ass8;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingDeque;

public class NumberShared {

    BlockingQueue<Integer> blockingQueue = new LinkedBlockingDeque<>(1);
    private  int  counter = 0;
    private  volatile boolean  flag = true;

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

    public void setFlag(boolean flag) {
        this.flag = flag;
    }

    public boolean isFlag() {
        return flag;
    }
}
