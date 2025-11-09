package com.fooddelievery.threadings;

public class FirstThreadRunable  implements  Runnable{
     static int a = 0;
    @Override
    public void run() {
        a++;
        System.out.println("  this is first thread with  today class " + a);
    }
}
