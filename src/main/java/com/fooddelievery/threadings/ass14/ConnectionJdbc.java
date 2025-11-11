package com.fooddelievery.threadings.ass14;

public class ConnectionJdbc
{
   static ConnectionJdbc connectionJdbc;
   public static ConnectionJdbc  creatConnection()
   {
       if(connectionJdbc ==null)
       {
           connectionJdbc =   new  ConnectionJdbc();
       }
       return   connectionJdbc;
   }

    public String  fetchUserName()
    {

        return   " Saqib ";
    }


}
