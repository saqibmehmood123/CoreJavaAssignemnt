package com.fooddelievery.threadings;

public class RunnerClass
{
    public static void main(String[] args) {


        SharedNumber sharedNumber  = new SharedNumber();
        SequentialNumber  sequentialNumber = new SequentialNumber("EvenNumber", sharedNumber);
        SequentialNumber  sequentialNumber2 = new SequentialNumber("OddNumber", sharedNumber);

        Thread thread1  = new Thread(sequentialNumber);
        Thread thread2  = new Thread(sequentialNumber2);

        thread1.start();
        thread2.start();

    }

}
