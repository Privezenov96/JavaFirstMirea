package ru.mirea.task1.harm1_5;

import java.util.Scanner;

public class Main {
    public static void main (String []args){
        final int n = 10;
        float s = 0;
        for (int i = 1; i <= n; i++) {
            s = s + 1.0f / i;
            System.out.println(s);
        }
    }
}
