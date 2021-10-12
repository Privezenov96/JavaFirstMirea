package ru.mirea.task2.dog;
import java.util.Scanner;
public class DOG {
    int age;
    String name;
    public DOG(){
        Scanner in = new Scanner(System.in);
        System.out.println("Введите имя собаки");
        name = in.next();
        System.out.println("Введите возраст собаки");
        age = in.nextInt();
    }
    public int ageDog(){
        return(age);
    }
    public int ageHum(){
        return(age * 7);
    }
    public String nameDog(){
        return(name);
    }
    public void ToString(){
        System.out.print("Собаке по имени ");
        System.out.print(nameDog());
        System.out.print(" ");
        System.out.print(ageDog());
        System.out.println(" лет");
        System.out.print("Что эквивалентно ");
        System.out.print(ageHum());
        System.out.println(" годам человеческой жизни");
    }
    public static void main(String[] args) {
        System.out.println("Сколько нужно создать особей?");
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        DOG[] x = new DOG[a];
        for( int i = 0; (i < a); i++){
            x[i] = new DOG();
        }
        System.out.println("Назовите номер собаки");
        int i = in.nextInt();
        x[i - 1].ToString();
    }
}
