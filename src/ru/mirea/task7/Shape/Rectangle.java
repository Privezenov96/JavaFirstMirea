package ru.mirea.task7.Shape;

public class Rectangle extends Shape{
    protected double width;
    protected double length;

    public Rectangle() {
        this.width = 5.5;
        this.length = 8;
        this.color = "orange";
        this.filled = false;
    }

    public Rectangle(double width, double length) {
        this.width = width;
        this.length = length;
        this.color = "orange";
        this.filled = false;
    }

    public Rectangle(double width, double length, String color, boolean filled) {
        this.width = width;
        this.length = length;
        this.color = color;
        this.filled = filled;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    @Override
    public double getArea() {
        return width * length;
    }

    @Override
    public double getPerimeter() {
        return 2 * (width + length);
    }

    @Override
    public String toString() {
        if (this.filled) {
            return "Shape: rectangle, width: " + this.width + ", length: " + this.length + ", color: " + this.color + ", filled";
        }
        return "Shape: rectangle, width: " + this.width + ", length: " + this.length + ", color: " + this.color + ", not filled";
    }
}
