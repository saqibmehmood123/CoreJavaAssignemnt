package com.fooddelievery.threadings.ass8;

public class Runner {
    public static void main(String[] args) {
        Thread daemonThread = new Thread(() -> {
            while (true) {
                System.out.println("Daemon working...");
                try { Thread.sleep(1000); } catch (Exception e) {}
            }
        });

        daemonThread.setDaemon(true); // Set as daemon
        daemonThread.start();
        NumberShared numberShared = new NumberShared();
        Thread firstThread = new Thread(new MyThread("Producer", numberShared));
        firstThread.start();
        Thread secondThread = new Thread(new MyThread("Consumer", numberShared));
        secondThread.start();

        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        numberShared.setFlag(false);




    }
}

