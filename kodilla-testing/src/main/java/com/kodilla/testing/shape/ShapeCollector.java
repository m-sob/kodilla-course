package com.kodilla.testing.shape;

import java.util.ArrayList;
import java.util.List;

public class ShapeCollector {
    public List<Shape> shapes = new ArrayList<>();

    public List<Shape> getShapes() {
        return shapes;
    }

    public void addFigure(Shape shape) {
        shapes.add(shape);
    }

    public boolean removeFigure(Shape shape) {
        return shapes.remove(shape);
    }

    public Shape getFigure(int n) {
        return shapes.get(n);
    }

    public String showFigures(){
        //  zwracającą nazwy wszystkich figur w postaci jednego Stringa.
        StringBuilder stringBuilder = new StringBuilder("");

        for (Shape shape : shapes) {
            stringBuilder.append(shape.getShapeName());
            stringBuilder.append(" ");
        }

        return stringBuilder.toString();
    }
}
