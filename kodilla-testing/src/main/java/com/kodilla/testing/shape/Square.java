package com.kodilla.testing.shape;

public class Square {
    private String name;
    private double sideSquare;

    public Square(String name, double sideSquare){
        this.name = name;
        this.sideSquare = sideSquare;
    }

    public double squareField() {
        return sideSquare * sideSquare;
    }
}
