package com.kodilla.testing.shape;

public class Circle {
    private String name;
    private double radius;

    public Circle(String name, double radius){
        this.name = name;
        this.radius = radius;
    }

    public double circleField() {
        return 3.14 * radius * radius;
    }
}
