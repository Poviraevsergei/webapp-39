package com.tms.solid.o.bad;

public class AreaCalculator {
    public double calculate(String shapeType, double... y) {
        return switch (shapeType) {
            case "circle" -> Math.PI * Math.pow(y[0], 2);
            case "rectangle" -> Math.PI * Math.pow(y[1], 2);
            default -> throw new IllegalArgumentException("Invalid shape type: " + shapeType);
        };
    }
}
