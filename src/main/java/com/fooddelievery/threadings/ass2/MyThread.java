package com.fooddelievery.threadings.ass2;

public class MyThread implements Runnable{

    private String threadName;

    public MyThread(String threadName) {
        this.threadName = threadName;
    }

    @Override
    public void run() {
         System.out.println(this.threadName + " is running 1");
        try {
             if(threadName.equals("First-THrewad"))
                Thread.yield();
            System.out.println(this.threadName + " is running  2");
            Thread.sleep(1000);
            System.out.println(this.threadName + " is running 3");

        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }


    }
}
