package com.fooddelievery.genericss.Set;

public class Entry<T>
{
       T element;
       Entry<T> nextNode;

       public Entry()
       {
           this.element = null;
           this.nextNode = null;
       }

       public void add(T element)
       {
           this.element = element;

       }


    public T get()
    {
      return   this.element ;

    }


}
