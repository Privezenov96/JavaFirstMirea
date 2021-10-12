package ru.mirea.task5.Furniture;

import java.util.Scanner;
public class Chair extends Furniture {
    public void consist() {
        System.out.println("6 палок и 2 доски");
    }
    public void applic() {
        System.out.println("Вы можете 1) посмотреть, 2) сесть 3) разрушить (default)");
        Scanner in = new Scanner(System.in);
        int i = in.nextInt();
        switch (i) {
            case 1:
                System.out.println("Вы получаете премию скукоты, а на что вы надеялись?");
                break;
            case 2:
                System.out.println("Вы сели. Ваша пятая точка получила немного опыта.");
                break;
            default:
                destroy();
        }
    }
    Chair() {
        type = "стул";
        applic();
    }
}
