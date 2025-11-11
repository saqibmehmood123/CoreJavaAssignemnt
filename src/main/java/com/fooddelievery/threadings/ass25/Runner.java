package com.fooddelievery.threadings.ass25;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ForkJoinPool;

public class Runner {
    public static void main(String[] args) throws InterruptedException {
        ForkJoinPool forkJoinPool = ForkJoinPool.commonPool();

        MyRecursiveTask myRecursiveTask = new MyRecursiveTask(15);
        forkJoinPool.invoke(myRecursiveTask);


        //  long mergedResult = forkJoinPool.invoke(myRecursiveTask);

        /// System.out .println("mergedResult = " + mergedResult);



    }
}

