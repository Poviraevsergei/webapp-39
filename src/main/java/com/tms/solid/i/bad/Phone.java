package com.tms.solid.i.bad;

public class Phone implements Devicable{
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
        System.out.println("");
        if (true){
            throw new RuntimeException();
        }
        return false;
    }
}
