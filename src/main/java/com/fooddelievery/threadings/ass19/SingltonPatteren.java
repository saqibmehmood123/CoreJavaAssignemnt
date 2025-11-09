package com.fooddelievery.threadings.ass19;

public class SingltonPatteren {
    private static SingltonPatteren sIngltonPatteren;
    private int counter = 0;

    private SingltonPatteren() {

    }

    public static synchronized SingltonPatteren createObject() {
        if (sIngltonPatteren == null) {
            sIngltonPatteren = new SingltonPatteren();
        }
        return sIngltonPatteren;
    }

    public int getCounter() {
        return counter;
    }

    public void setCounter(int counter) {
        this.counter = counter;
    }
}
