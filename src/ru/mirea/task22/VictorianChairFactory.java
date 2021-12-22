package ru.mirea.task22;

public class VictorianChairFactory implements ChairFactory {
    @Override
    public VictorianChair createChair() {
        return new VictorianChair();
    }
}
