package ru.mirea.task3.Circle;
import java.util.Scanner;
public class Circle {
    public Circle(){
        System.out.println("Какой признак вам известен?");
        System.out.println("1) радиус 2) диаметр 3) длина окружности");
        Scanner in = new Scanner(System.in);
        int i = in.nextInt();
        System.out.println("Введите");
        switch(i) {
            case(1):
                r = in.nextInt();
                d = 2 * r;
                c = 2f * 3.14f * r;
                break;
            case(2):
                d = in.nextInt();
                r = d / 2;
                c = 2f * 3.14f * r;
                break;
            case(3):
                c = in.nextInt();
                r = c / 6.28f;
                d = 2 * r;
                break;
            default:
                break;
        }
    }
    float r;
    float d;
    float c;
    public void info(){
        System.out.print("Радиус ");
        System.out.println(r);
        System.out.print("Диаметр ");
        System.out.println(d);
        System.out.print("Длина окружности ");
        System.out.println(c);
    }
    public static void main(String[] args) {
        for(;;){
            System.out.println("Хотите создать/изменить окружность?");
            Scanner in = new Scanner(System.in);
            String bool = in.next();
            if (bool.equals("да")) {
                Circle l = new Circle();
                l.info();
            }
            else
                break;
        }
    }
}
