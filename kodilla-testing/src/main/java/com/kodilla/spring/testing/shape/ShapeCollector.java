package com.kodilla.spring.testing.shape;

import java.util.ArrayList;
import java.util.List;

public class ShapeCollector {

    private List<Shape> list = new ArrayList<Shape>();

    public ShapeCollector(List<Shape> list) {

        this.list = new ArrayList<>(list);
    }

    public void addFigure(Shape shape) {

        list.add(shape);
    }

    public void removeFigure(Shape shape) {

        list.remove(shape);
    }

    public Shape getFigure(int n) {
        if (n < list.size() && n >= 0) {
            return list.get(n);
        } else {
            return null;
        }
    }

    public List<Shape> showFigures() {
        for (Shape figures : list) {
            System.out.println(figures);
        }
        return list;
    }

    @Override
    public String toString() {
        return "ShapeCollector{" +
                "List=" + list +
                '}';
    }

    public List<Shape> getList() {

        return list;
    }
}
