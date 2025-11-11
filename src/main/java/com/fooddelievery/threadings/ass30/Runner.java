package com.fooddelievery.threadings.ass30;

import java.util.concurrent.ForkJoinPool;

public class Runner {
    public static void main(String[] args) throws InterruptedException {
        ForkJoinPool forkJoinPool = ForkJoinPool.commonPool();

        MyRecursiveTask myRecursiveTask = new MyRecursiveTask(15);



        long mergedResult = forkJoinPool.invoke(myRecursiveTask);



        System.out .println("mergedResult = " + mergedResult);



    }
}

