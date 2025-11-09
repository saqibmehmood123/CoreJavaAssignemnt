package com.fooddelievery.threadings.ass5;

public class NumberShared
{
    private int number  = 0 ;
    private int upperBound = 15;
    public NumberShared(int number) {
        this.number = number;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber() {
        this.number++;
    }

    public int getUpperBound() {
        return upperBound;
    }

    public void setUpperBound(int upperBound) {
        this.upperBound = upperBound;
    }
}
