package ru.mirea.task6.Nameable;

public class Bag implements Nameable {
    String name;

    Bag (String Name) {
        this.name = Name;
    }

    public String getName() {
        return this.name + " is bag";
    }
}