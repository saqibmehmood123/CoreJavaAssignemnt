package com.fooddelievery.threadings;

public class Threadings
{
    public static void main(String[] args) throws InterruptedException {

        threading1();

    }

        public  static void threading1() throws InterruptedException {

            ///   Create and start threads using Thread class and Runnable interface
         Runnable runnable = new FirstThread();

        Thread thread = new Thread(runnable);
        thread.start();

            thread.join();
            Thread thread2 = new Thread(runnable);
            thread2.start();

            thread2.join();
        }

}
