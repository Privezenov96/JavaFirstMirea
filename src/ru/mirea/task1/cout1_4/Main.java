package ru.mirea.task1.cout1_4;
import java.util.Scanner;
public class Main {
    public static void main (String []args){
        final int n = 3;
        Scanner in = new Scanner(System.in);
        String[] s = new String[n];
        for (int i = 0; i < n; i++){
            s[i] = in.next();
         }
        for (int i = 0; i < n; i++) {
            System.out.println(s[i]);
        }
    }
}
