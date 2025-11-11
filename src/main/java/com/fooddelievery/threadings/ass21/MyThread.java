package com.fooddelievery.threadings.ass21;

import java.util.concurrent.atomic.AtomicInteger;

public class MyThread implements Runnable {

   private String threadName;
  private AtomicCounter atomicCounter;

    public MyThread(String threadName , AtomicCounter atomicCounter ) {
           this.atomicCounter = atomicCounter;
           this.threadName = threadName;
    }

    @Override
    public void run()
    {
        try {

            int counter =    this.atomicCounter.increaseCounter();
            System.out.println(counter);
        } catch (Exception e)
        {
            System.out.println("    " + e.getMessage() );
        }

    }


}
