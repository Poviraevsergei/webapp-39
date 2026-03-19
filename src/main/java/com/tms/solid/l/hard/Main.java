package com.tms.solid.l.hard;

public class Main {
    public static void main(String[] args) {
        Rectangle rectangle = new Square();
        rectangle.setHeight(20);
        rectangle.setWight(10);
        System.out.println(rectangle.calculateArea());
    }
}
