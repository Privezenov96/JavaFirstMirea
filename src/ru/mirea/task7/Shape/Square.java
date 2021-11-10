package ru.mirea.task7.Shape;

public class Square extends Rectangle {
    public Square() {
        this.width = 5.5;
        this.length = 5.5;
        this.color = "black";
        this.filled = true;
    }

    public Square(double side) {
        this.width = side;
        this.length = side;
        this.color = "black";
        this.filled = true;
    }

    public Square(double side, String color, boolean filled) {
        this.width = side;
        this.length = side;
        this.color = color;
        this.filled = filled;
    }

    public double getSide() {
        return width;
    }

    public void setSide(double side) {
        this.width = side;
        this.length = side;
    }

    @Override
    public void setWidth(double side) {
        this.width = side;
        this.length = side;
    }

    @Override
    public void setLength(double side) {
        this.width = side;
        this.length = side;
    }

    @Override
    public String toString() {
        if (this.filled) {
            return "Shape: square, side: " + this.width + ", color: " + this.color + ", filled";
        }
        return "Shape: square, side: " + this.width + ", color: " + this.color + ", not filled";
    }
}
