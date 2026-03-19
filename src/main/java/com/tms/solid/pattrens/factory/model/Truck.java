package com.tms.solid.pattrens.factory.model;

public class Truck implements Transport{
    @Override
    public void deliver() {
        System.out.println("Доставка груза по дороге");
    }
}
