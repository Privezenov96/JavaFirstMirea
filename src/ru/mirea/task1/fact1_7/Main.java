package ru.mirea.task1.fact1_7;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        final int n = 23;
        long a = 1;
        for (int i = 1; i <= n; i++) {
            a = a * i;
        }
        System.out.println(a);
    }
}
