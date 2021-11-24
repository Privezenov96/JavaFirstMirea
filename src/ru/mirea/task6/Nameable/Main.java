package ru.mirea.task6.Nameable;

import ru.mirea.task6.Priceable.HeadPhones;

public class Main {
    public static void main(String[] args) {
        Nameable obj = new Bag("Gucci GG Marmont 2.0");
        System.out.println(obj.getName());
         obj = new PC("Компьютер Lenovo ThinkCentre");
        System.out.println(obj.getName());
    }
}
