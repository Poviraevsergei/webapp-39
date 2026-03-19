package com.tms.solid.pattrens.factory.model;

public class Ship implements Transport{
    @Override
    public void deliver() {
        System.out.println("Доставляем груз по воде");
    }
}
