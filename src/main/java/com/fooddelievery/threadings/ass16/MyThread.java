package com.fooddelievery.threadings.ass16;

import java.util.concurrent.locks.ReadWriteLock;

public class MyThread implements Runnable {

    private String threadName;
    ReadWriteLock lock;

    Cache cache  ;

    public MyThread(String threadName , ReadWriteLock lock ,Cache cache ) {
        this.threadName = threadName;
        this.lock = lock;
        this.cache =  cache;
    }


    @Override
    public void run() {
        try {
             if(this.threadName.equals("Writer"))
             {
                 this.lock.writeLock().lock();
                 cache.writeToCache(1,2);
                 this.lock.writeLock().unlock();
             }
             else
             {
                 this.lock.readLock().lock();
                 cache.readeFromCache();
                 this.lock.readLock().unlock();

             }
        } catch (Exception e) {
            throw new RuntimeException(e);
        }

    }

}
