package ru.mirea.task6.Priceable;

public class Train implements Priceable {
    String price = "87 млн рублей";
    public Train(){}
    public void getPrice(){
        System.out.println(price);
    }
}