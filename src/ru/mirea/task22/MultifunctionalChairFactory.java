package ru.mirea.task22;

public class MultifunctionalChairFactory implements ChairFactory {
    @Override
    public MultifunctionalChair createChair() {
        return new MultifunctionalChair();
    }
}