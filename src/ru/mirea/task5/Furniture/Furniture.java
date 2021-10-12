package ru.mirea.task5.Furniture;
import java.util.Scanner;
public abstract class Furniture {
    public void destroy(){
        System.out.print("Поздравляю вы зачем-то сломали " + type + " и получили ");
        consist();
    }
    public String type;
    public abstract void consist();
    public abstract void applic();

}
