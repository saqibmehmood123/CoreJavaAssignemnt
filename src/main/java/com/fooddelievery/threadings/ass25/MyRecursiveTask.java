package com.fooddelievery.threadings.ass25;

import java.util.concurrent.RecursiveAction;
import java.util.concurrent.RecursiveTask;
import java.util.concurrent.atomic.AtomicInteger;

public class MyRecursiveTask
        extends RecursiveAction {
     ///   extends RecursiveTask<Long> {

    private long workLoad = 0;

    public MyRecursiveTask(long workLoad) {
        this.workLoad = workLoad;
    }
    @Override
    protected void compute() {
        //if work is above threshold, break tasks up into smaller tasks
        if(this.workLoad > 16) {
            System.out.println("Splitting workLoad : " + this.workLoad);

            long workload1 = this.workLoad / 2;
            long workload2 = this.workLoad - workload1;

            MyRecursiveTask subtask1 = new MyRecursiveTask(workload1);
            MyRecursiveTask subtask2 = new MyRecursiveTask(workload2);

            subtask1.fork();
            subtask2.fork();

        } else {
            System.out.println("Doing workLoad myself: " + this.workLoad);
        }
    }
/*
    @Override
    protected Long compute() {
        System.out.println(" Entring  : " + this.workLoad);
        //if work is above threshold, break tasks up into smaller tasks
        if(this.workLoad > 4) {
            long workload1 = this.workLoad / 2;
            long workload2 = this.workLoad - workload1;
            MyRecursiveTask subtask1 = new MyRecursiveTask(workload1);
            MyRecursiveTask subtask2 = new MyRecursiveTask(workload2);
            subtask1.fork();
            subtask2.fork();
            long result = 0;
            result += subtask1.join();
            result += subtask2.join();
            return result;
        } else {
            System.out.println("Doing workLoad myself: " + this.workLoad);
            return workLoad * 3;
        }
    }*/
}
