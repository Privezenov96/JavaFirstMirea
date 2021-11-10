package ru.mirea.task10.ab00;

import java.util.Scanner;

public class ab00 {
    public static int rec(int a, int b){
        if (a > b + 1)
            return(0);
        if ((a == 0) || (b == 0))
            return(1);
        return(rec(a, b - 1) + rec(a - 1, b - 1));
    }
    public static void main(String[] args) {
        System.out.println("Введите число 1");
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        System.out.println("Введите число 0");
        int b = in.nextInt();
        System.out.println(rec(a, b) + " последовательностей");
    }
}
