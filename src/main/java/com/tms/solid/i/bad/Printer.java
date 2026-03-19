package com.tms.solid.i.bad;

public class Printer implements Devicable {
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

    @Override
    public boolean printInfo() {
        return false;
    }
}
