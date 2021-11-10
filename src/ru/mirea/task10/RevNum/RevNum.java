package ru.mirea.task10.RevNum;

import java.util.Scanner;

public class RevNum {
    public static int rev(int cur, int ans){
        if (cur == 0)
            return(ans);
        else{
            return(rev(cur / 10, ans * 10 + cur % 10));

        }
    }
    public static void main(String[] args) {
        System.out.println("Введите число");
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        System.out.println(rev(a, 0));
    }
}
