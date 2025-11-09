package com.fooddelievery.threadings.ass9;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.*;

public class Runner {
    public static void main(String[] args) {

       Thread t1 = new Thread(new MyThread());
       Thread t2 = new Thread(new MyThread());
       t1.start();
        t2.start();

        try {
            t1.join();
            t2.join();
        } catch (Exception e) {
            System.out.println("  this is main thread exception  " + e);

        }
      System.out.println(" this is main thread ");
    }
}

