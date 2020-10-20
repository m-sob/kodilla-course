package com.kodilla.testing.shape;

public class Triangle {
    private String name;
    private double width;
    private double height;

    public Triangle(String name, double width, double height){
        this.name = name;
        this.width = width;
        this.height = height;
    }

    public double triangleField() {
        return (width * height) / 2;
    }

}
