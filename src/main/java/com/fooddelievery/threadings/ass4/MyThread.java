package com.fooddelievery.threadings.ass4;

public class MyThread implements Runnable{

    private NumberShared number;
    private String threadName;

    public MyThread(String threadName , NumberShared number) {

        this.threadName = threadName;
        this.number = number;
    }

    @Override
    public void run() {
        while (this.number.getUpperBound()<16)
        {

                      try {
                            if(threadName.equals("First-Threwad") &&  this.number.getNumber() %3 ==0 )
                                  {
                                      this.number.setNumber();
                                       System.out.println(this.threadName + " is increasing number " +this.number.getNumber()  );

                                    }

                              if(threadName.equals("Second-Thread") &&  this.number.getNumber() %3 ==1 )
                                {
                                     this.number.setNumber();
                                   System.out.println(this.threadName + " is increasing number " +this.number.getNumber()  );

                                   }
                                    if(threadName.equals("Third-Thread") &&  this.number.getNumber() %3 ==2 )
                                     {
                                         this.number.setNumber();
                                           System.out.println(this.threadName + " is increasing number " +this.number.getNumber()  );

                                      }

                          } catch (Exception e) {
                         throw new RuntimeException(e);
                        }
                    }

    }
}
