package com.tms.solid.l.hard;

public class Rectangle {
    private int wight;
    private int height;

    public int getWight() {
        return wight;
    }

    public void setWight(int wight) {
        this.wight = wight;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public long calculateArea(){
        return wight * height;
    }
}
