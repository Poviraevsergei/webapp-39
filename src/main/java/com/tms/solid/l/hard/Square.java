package com.tms.solid.l.hard;

public class Square extends Rectangle {
    @Override
    public void setWight(int wight) {
        super.setWight(wight);
        super.setHeight(wight);
    }

    @Override
    public void setHeight(int height) {
        super.setHeight(height);
        super.setWight(height);
    }
}
