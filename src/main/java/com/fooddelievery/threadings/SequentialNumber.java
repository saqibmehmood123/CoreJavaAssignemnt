package com.fooddelievery.threadings;

public class SequentialNumber implements Runnable
{
    String threadName;
    final SharedNumber sharedNumber;

    public SequentialNumber(String threadName,SharedNumber sharedNumber) {
        this.threadName = threadName;
        this.sharedNumber = sharedNumber;

    }

    @Override
    public void run()
    {
        while (true) {
        synchronized (this.sharedNumber)
        {

            if (this.threadName.equals("EvenNUmber")  && sharedNumber.sequnetailaNumber % 2 == 0) {

                this.sharedNumber.printNUmber(this.threadName);
                sleepThread();
                sharedNumber. notify();
                try {
                    sharedNumber.wait();
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }


            } else if (this.threadName.equals("OddNUmber")  && sharedNumber.sequnetailaNumber % 2 == 1)   {                 ///
                this.sharedNumber.printNUmber(this.threadName);
                sleepThread();
                sharedNumber.notify();
                try {
                    sharedNumber.wait();
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }

            }

        }
        }

    }

    private void sleepThread()
    {
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }




}
