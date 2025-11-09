package com.fooddelievery.threadings.ass8;

public class MyThread implements Runnable {

    private NumberShared number;
    private String threadName;

    public MyThread(String threadName, NumberShared number) {

        this.threadName = threadName;
        this.number = number;
    }

    @Override
    public void run() {
        while (this.number.isFlag()) {
            try {
                if (threadName.equals("Producer")) {
                    this.number.put(this.threadName);
                }
                if (threadName.equals("Consumer")) {
                    Integer number = this.number.get();///                        return blockingQueue.take();
                    System.out.println(this.threadName + " has consumed number " + number);

                }

            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }

        }
    }
}
