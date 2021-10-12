package ru.mirea.task6.Priceable;

public class HeadPhones implements Priceable {
    String price = "999 рублей";
    public HeadPhones(){}
    public void getPrice(){
        System.out.println(price);
    }

}
