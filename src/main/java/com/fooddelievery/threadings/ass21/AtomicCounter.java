package com.fooddelievery.threadings.ass21;

import java.util.concurrent.atomic.AtomicInteger;

public class AtomicCounter {
    private AtomicInteger counter   ;
    public AtomicCounter() {
        counter = new AtomicInteger(1);
    }

    public  int increaseCounter() {
     return     counter.incrementAndGet();

    }

}
