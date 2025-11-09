package com.fooddelievery.threadings.ass19;

public class MyThread implements Runnable {

   private String threadName;
   private   SingltonPatteren singltonPatteren;
    public MyThread(String threadName ,SingltonPatteren singltonPatteren) {

        this.threadName = threadName;
        this.singltonPatteren =  singltonPatteren;
    }

    @Override
    public void run()
    {
        synchronized (this.singltonPatteren)
        {
            if(this.threadName.equals("First-Thread"))
            {
                this.singltonPatteren.setCounter(405);
            }
            else if(this.threadName.equals("Second-Thread"))
            {
              System.out.println(this.singltonPatteren.getCounter());
            }
        }

    }

}
