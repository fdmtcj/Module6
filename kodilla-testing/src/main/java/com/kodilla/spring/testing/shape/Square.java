package com.kodilla.spring.testing.shape;

import java.util.Objects;

public class Square implements Shape {

    String shapeName;
    double field;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Square square = (Square) o;
        return Double.compare(square.field, field) == 0 &&
                shapeName.equals(square.shapeName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(shapeName, field);
    }

    public Square(double sideLength) {
        this.shapeName = "square";
        this.field = sideLength * sideLength;

    }

    public String getShapeName() {
        return this.shapeName;
    }

    public double getField() {
        return this.field;
    }

    @Override
    public String toString() {
        return "Square{" +
                "shapeName='" + shapeName + '\'' +
                ", field=" + field +
                '}';
    }
}
