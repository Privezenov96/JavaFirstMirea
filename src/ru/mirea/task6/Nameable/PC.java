package ru.mirea.task6.Nameable;

class PC implements Nameable {
    String name;

    PC(String Name) {
        this.name = Name;
    }

    public String getName() {
        return this.name + " is PC";
    }
}