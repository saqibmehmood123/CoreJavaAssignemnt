package com.fooddelievery.threadings.ass12;

import java.util.concurrent.*;

public class Runner {
    public static void main(String[] args) {
        Combine numberShared = new Combine();


        ExecutorService executor = Executors.newFixedThreadPool(2);
        //Create MyCallable instance
        Callable<Integer> callable = new MyThread("FirstThread", 10);
        Future<Integer> future = executor.submit(callable);
        Callable<Integer> callable2 = new MyThread("SecondThread", 10);
        Future<Integer> future2 = executor.submit(callable2);
        Integer result1 = 0;
        Integer result2 = 0;
        try {
            result1 = future.get();
            result2 = future2.get();
            System.out.println(" result here is --  " + result1.intValue());
            System.out.println(" result here is --  " + result2.intValue());

        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        } catch (ExecutionException e) {
            throw new RuntimeException(e);
        }
        Combine combine = new Combine();
        combine.calculate(result1, result2);

        executor.shutdown();
    }
}

