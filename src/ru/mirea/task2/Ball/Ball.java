package ru.mirea.task2.Ball;

public class Ball {
    private double x = 0.0;
    private double y = 0.0;

    public Ball(){}
    public Ball(double x, double y){
        this.x = x;
        this.y = y;
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    public void setXY(double x, double y){
        this.x = x;
        this.y = y;
    }

    public void move( double xDisp, double yDisp){
        x+=xDisp;
        y+=yDisp;
    }
    //    @Override
    public String toString() {
        return "Ball @ (" + this.x + ", " + this.y + ").";
    }
    public static void main(String[] args) {
        Ball b1 = new Ball(100, 100);
        System.out.println(b1);
        b1.move(30, 15);
        System.out.println(b1);
    }
}