package ru.mirea.task2.Shape;

public class Shape {
    public int area;
    public Shape(int area) {
        this.area = area;
    }

    @Override
    public String toString() {
        return "Shape{" +
                "area=" + area +
                '}';
    }
    public static void main(String[] args) {
        System.out.println(new Shape(5));
        System.out.println(new Shape(10));
    }
}