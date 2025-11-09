package com.fooddelievery.threadings;

public class FirstThread  implements Runnable{
    int counter = 0;
    String name = "myThread";
    @Override
    public void run() {

       int check =     counter++;
        System.out.println(name + " threads class before  " +counter);
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println(" threads class after ");
        name = "secondTHread";
    }
}
