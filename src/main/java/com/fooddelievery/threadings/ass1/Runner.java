package com.fooddelievery.threadings.ass1;

public class Runner
{
    public static void main(String[] args) {

        Thread firstThread = new Thread(new MyThread("First-First"));
        firstThread.start();
        Thread secondThread = new Thread(new MyThread("Second-Thread"));
        secondThread.start();


    }
}

