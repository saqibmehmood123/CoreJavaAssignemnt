package com.fooddelievery.threadings.ass2;

public class Runner
{
    public static void main(String[] args) {

        Thread firstThread = new Thread(new MyThread("First-THrewad"));
        firstThread.start();
        Thread secondThread = new Thread(new MyThread("Second-Thread"));
        secondThread.start();


    }
}

