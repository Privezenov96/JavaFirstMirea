package ru.mirea.task10.Polin;

import java.util.Scanner;

public class Polin {
    public static void main(String[] args) {
        System.out.println("Введите слово");
        Scanner in = new Scanner(System.in);
        String slovo = in.next();
        String revSlovo = new StringBuffer(slovo).reverse().toString();
        if (slovo.equals(revSlovo))
            System.out.println(slovo + " - палиндром");
        else
            System.out.println(slovo + " - не палиндром");
    }

}
