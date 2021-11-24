package ru.mirea.task5.Dish;

public abstract class Dish {
    private final String color;
    private final String form;

    public Dish(String Color, String Form) {
        this.color = Color;
        this.form = Form;
    }

    public String getColor() {
        return color;
    }

    public String getForm() {
        return form;
    }

    public String toString() {
        return "Color: " + getColor() + "; form: " + getForm();
    }
}

class RoundDish extends Dish {
    private int radius;

    public RoundDish(String Color, String Form, int Radius) {
        super(Color, Form);
        this.radius = Radius;
    }

    public int getRadius() {
        return radius;
    }

    public String toString() {
        return super.toString() + "; radius: " + getRadius();
    }
}

class  SaladDish extends Dish {
    private int deep;

    public SaladDish(String Color, String Form, int Deep) {
        super(Color, Form);
        this.deep = Deep;
    }

    public int getDeep() {
        return deep;
    }

    public String toString() {
        return super.toString() + "; deep: " + getDeep();
    }
    public static void main(String[] args) {
        RoundDish dish1 = new RoundDish("red", "Round", 12);
        System.out.println(dish1.toString());

        SaladDish dish2 = new SaladDish("brown", "Square", 20);
        System.out.println(dish2.toString());
    }
}

