package com.fooddelievery.threadings;

public class SharedNumber
{
       int sequnetailaNumber = 0;

       public void printNUmber(String threadNmae)
       {
           System.out.println(threadNmae+"   "+sequnetailaNumber);
           sequnetailaNumber++;
       }


}
