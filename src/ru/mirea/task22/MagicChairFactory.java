package ru.mirea.task22;

public class MagicChairFactory implements ChairFactory {
    @Override
    public MagicChair createChair() {
        return new MagicChair();
    }
}
