package ru.mirea.task7.Shape;

public abstract class Shape {
    protected String color;
    protected boolean filled;

    public Shape() {
        this.color = "blue";
        this.filled = true;
    }

    public Shape(String color, boolean filled) {
        this.color = color;
        this.filled = filled;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isFilled() {
        return filled;
    }

    public void setFilled(boolean filled) {
        this.filled = filled;
    }

    public abstract double getArea();
    public abstract double getPerimeter();
    public String toString() {
        if (this.filled) {
            return "Color: " + this.color + ", filled";
        }
        return "Color: " + this.color + ", not filled";
    }
}
