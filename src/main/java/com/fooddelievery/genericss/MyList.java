package com.fooddelievery.genericss;

public class MyList<T>
{
    private T content;
    private String boxName;
    private final int boxId;
    private static int boxCount = 0;

    // Constructor
    public MyList(String name) {
        this.boxName = name;
        this.boxId = ++boxCount;
    }

    // Basic getter/setter
    public void setContent(T content) {
        this.content = content;
    }

    public T getContent() {
        return content;
    }

    // Check if box is empty
    public boolean isEmpty() {
        return content == null;
    }

    // Clear the box
    public void clear() {
        this.content = null;
    }

    // Get box info (NOTE: can't use T in static context)
    public String getBoxInfo() {
        return "Box#" + boxId + " [" + boxName + "] contains: " +
                (content != null ? content.toString() : "Empty");
    }

    // Static method - can't use T here!
    public static int getTotalBoxes() {
        return boxCount;
    }

}
