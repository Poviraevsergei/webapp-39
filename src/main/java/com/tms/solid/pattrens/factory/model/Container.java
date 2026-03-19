package com.tms.solid.pattrens.factory.model;

public class Container implements Package{
    @Override
    public void pack() {
        System.out.println("Контейнер для перевоза груза по воде");
    }
}
