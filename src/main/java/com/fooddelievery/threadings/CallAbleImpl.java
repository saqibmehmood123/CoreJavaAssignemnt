package com.fooddelievery.threadings;

import java.util.concurrent.Callable;

public class CallAbleImpl  implements Callable<String> {
    String name ;

    /*public CallAbleImpl(String name) {
        this.name = name;
    }

    @Override
    public String call() throws Exception {
        if(this.name.equals("a"))
            return " a ";
        else  if(this.name.equals("b"))
            return " b ";
        else  if(this.name.equals("c"))
            return " c ";
        return "";
    }
     */

    @Override
    public String call() throws Exception {

        System.out.println("  this is calling fo thread ");
        return "  this is string returning ";
    }

}
