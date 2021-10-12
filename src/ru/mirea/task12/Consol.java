package ru.mirea.task12;
import java.io.File;

public class Consol {
    public static void main(String[] args) {
        File zip = new File("C//Users//User//Desktop//Новая папка");
        boolean a = zip.exists();
        System.out.println(a);
    }
}
