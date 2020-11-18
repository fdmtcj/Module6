package com.kodilla.testing.shape;

import java.util.Objects;

public class Triangle implements Shape {

    String shapeName;
    double field;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Triangle triangle = (Triangle) o;
        return Double.compare(triangle.field, field) == 0 &&
                shapeName.equals(triangle.shapeName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(shapeName, field);
    }

    public Triangle(double sideLength, double height) {
        this.shapeName = "triangle";
        this.field = 0.5 * sideLength * height;

    }

    public String getShapeName() {
        return this.shapeName;
    }

    public double getField() {
        return this.field;
    }

    @Override
    public String toString() {
        return "Triangle{" +
                "shapeName='" + shapeName + '\'' +
                ", field=" + field +
                '}';
    }
}
