package com.fooddelievery.genericss;

public class Runner
{
    public static void main(String[] args) {
        MyList<String> stringBox = new MyList<>("Documents");
        stringBox.setContent("Important File");
        System.out.println(stringBox.getBoxInfo()); // Box#1 [Documents] contains: Important File

        MyList<Integer> intBox = new MyList<>("Numbers");
        intBox.setContent(42);
        System.out.println(intBox.getBoxInfo()); // Box#1 [Documents] contains: Important File

        System.out.println("Total boxes: " + MyList.getTotalBoxes()); // Total boxes: 2
    }

}
