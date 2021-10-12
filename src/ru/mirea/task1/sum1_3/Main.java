package ru.mirea.task1.sum1_3;

public class Main {
    public static void main (String []args){
        final int n = 3;
        int s = 0;
        int[] a = {1, 2, 3};
        for (int i = 0; i < n; i++){
          s = s + a[i];
        }
        System.out.println("Сумма массива: " + s);
    }
}
