package ru.mirea.task1.rand1_6;
import java.util.Random;
public class Main {
    public static void main (String []args){
        final int n = 10;
        final int a = 5; //Нижняя граница включительно
        final int b = 10; // Верхняя граница не включительно
        int[] x = new int[n];
        for (int i = 0; i < n; i++) {
           // x[i] = (int) (Math.random() * (b - a)) + a;
            Random random = new Random();
            x[i] = random.nextInt(b - a) + a;
            System.out.print(x[i]);
            System.out.print(" ");
        }
        for (int i = 0; i < n; i++) {
            int s = b;
            int xi = -1;
            for (int j = i; j < n; j++) {
                if (x[j] < s) {
                    s = x[j];
                    xi = j;
                }
            }
            x[xi] = x[i];
            x[i] = s;
        }
        System.out.println();
        for (int i = 0; i < n; i++) {
            System.out.print(x[i]);
            System.out.print(" ");
        }
    }
}
