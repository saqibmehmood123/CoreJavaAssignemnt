package com.fooddelievery.genericss.Set;

public class OwnSet<T>
{
    Entry<T>  setElement;


    public void add(T elemnenttoadd )
    {

        if( this.setElement ==null)
        {
            this.setElement = new Entry<>();
            this.setElement.element = elemnenttoadd;
        }

        else {
            Entry<T> current = this.setElement;



            while (current != null)
            {
                if (current.element.equals(elemnenttoadd)) {
                    return; // Exit if duplicate found
                }

                    if(current.nextNode != null)
                    {

                        current = current.nextNode;
                    }

             else {
                            Entry<T> newElement = new Entry<>();
                            newElement.add(elemnenttoadd);
                            current.nextNode = newElement;
                            current = newElement.nextNode;



             }
            }

        }
    }




    public void print()
    {
        System.out.println("   ---------------------------- print method ------------------------------");

        Entry<T> current = this.setElement;

        while (current != null)
        {
              System.out.println(current.element);
            if(current.nextNode != null)
            {
                current = current.nextNode;
            }  else
            {
                current = null;
            }
        }


    }

}
