package com.fooddelievery.threadings.ass6;

public class Runner {
    public static void main(String[] args) {

        NumberShared numberShared = new NumberShared();
        Thread firstThread = new Thread(new MyThread("Producer", numberShared));
        firstThread.start();
        Thread secondThread = new Thread(new MyThread("Consumer", numberShared));
        secondThread.start();

    }
}

