package com.tms.solid.pattrens.factory.model;

public class Box implements Package {
    @Override
    public void pack() {
        System.out.println("Деревянная коробка для перевозки товара");
    }
}
