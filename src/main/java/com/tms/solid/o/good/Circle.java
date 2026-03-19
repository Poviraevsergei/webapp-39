package com.tms.solid.o.good;

public class Circle implements Shape {
    private double radius;

    @Override
    public double getArea() {
        return Math.PI * Math.pow(radius, 2);
    }
}
