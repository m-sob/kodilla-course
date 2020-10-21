package com.kodilla.testing.shape;

public class Triangle  implements Shape {
    private double width;
    private double height;

    public Triangle(double width, double height){
        this.width = width;
        this.height = height;
    }

    @Override
    public String getShapeName() {
        return "Triangle";
    }

    @Override
    public double getField() {
        return (width * height) / 2;
    }
}
