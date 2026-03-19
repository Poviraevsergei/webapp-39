package com.tms.solid.pattrens.proxy.easier;

public class Car implements Transport{

    @Override
    public void start(){
        System.out.println("Car start");
    }

    @Override
    public void stop(){
        System.out.println("Car stop");
    }
}
