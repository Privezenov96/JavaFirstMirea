package ru.mirea.task4.Ball;

public class Ball {
    double x = 0.0;
    double y = 0.0;
    Ball(){

    }
    Ball(double x, double y){
        this.x = x;
        this.y = y;
    }
    public double getX(){
        return(x);
    }
    public void setX(double x){
        this.x = x;
    }
    public double getY(){
        return(y);
    }
    public void setY(double y){
        this.y = y;
    }
   public void setXY(double x, double y){
        this.x = x;
        this.y = y;
    }
    public void move (double xDisp, double yDisp){
        x = x + xDisp;
        y = y + yDisp;
    }
    public String toString(){
String text = "Мяч находится в координатах ";
return(text + x + " " + y);
    }
}
