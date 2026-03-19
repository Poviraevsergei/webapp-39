package com.tms.solid.o.good;

public class Triangle implements Shape {
    private double x;

    @Override
    public double getArea() {
        return Math.PI * Math.pow(x, 2); //неверная формула
    }
}
