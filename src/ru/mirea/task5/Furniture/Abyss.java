package ru.mirea.task5.Furniture;

import java.util.Scanner;

public class Abyss extends Furniture {

    public void consist() {
        System.out.println("большой взрыв");
    }

    Abyss() {
        type = "черная дыра";
        applic();
    }

    public void applic() {
        System.out.println("Вы можете 1) посмотреть, 2) прыгнуть 3) насмехаться 4) разрушить (default)");
        Scanner in = new Scanner(System.in);
        int i = in.nextInt();
        switch (i) {
            case 1:
                System.out.println("Вы посмотрели в бездну. Вам показалось что бездна смотрит на вас.");
                break;
            case 2:
                System.out.println("Вы прыгнули в бездну. Перед вами открывается механизм где измерение время реализовано в пространстве." + "\n" + "Вы пытаетесь изменить цепочку событий так чтобы изменить прошлое, а потом понимаете что именно ваши изменения привели к текущей ситуации.");
                break;
            case 3:
                System.out.println("Вы насмехаетесь над черной дырой. Вы слышите непонятный шум." + "\n" + "Поздравляем вас зачем-то разрушила черная дыра и получила 2 мяса и 3 кости");
                break;
            default:
                destroy();
                System.out.println("You're dead");
        }
    }

    public static void main(String[] args) {
        System.out.println("Вы хотите создать 1) стул или 2) черную дыру ?");
        Scanner in = new Scanner(System.in);
        int i = in.nextInt();
        switch (i) {
            case 1:
                Chair lol = new Chair();
                break;
            case 2:
                Abyss pip = new Abyss();
                break;
        }
    }
}

