package com.fooddelievery.threadings.ass9;

import java.util.concurrent.Callable;

public class MyThread implements Runnable {

    @Override
    public void run()
    {
            System.out.println(" some heavy taks ");
    }
}
