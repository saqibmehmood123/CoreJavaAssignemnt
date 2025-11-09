package com.fooddelievery.threadings.ass5;

public class Runner
{
    public static void main(String[] args) {

        NumberShared numberShared = new NumberShared(0);
        Thread firstThread = new Thread(new MyThread("First-Threwad" ,numberShared));
        firstThread.start();
        Thread secondThread = new Thread(new MyThread("Second-Thread",numberShared));
        secondThread.start();
        Thread thirdThread = new Thread(new MyThread("Third-Thread" ,numberShared));
        thirdThread.start();

    }
}

