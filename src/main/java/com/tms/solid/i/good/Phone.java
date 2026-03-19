package com.tms.solid.i.good;

public class Phone implements Devicable {
    @Override
    public boolean turnOn() {
        return false;
    }

    @Override
    public boolean turnOff() {
        return false;
    }

    @Override
    public boolean showInfo() {
        return false;
    }
}
