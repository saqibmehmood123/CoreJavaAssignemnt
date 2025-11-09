package com.fooddelievery.threadings.ass7;

public class Runner {
    public static void main(String[] args) {

        NumberShared numberShared = new NumberShared();
        Thread firstThread = new Thread(new MyThread("Producer", numberShared));
        firstThread.start();
        Thread secondThread = new Thread(new MyThread("Consumer", numberShared));
        secondThread.start();

        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        numberShared.setFlag(false);

    }
}

