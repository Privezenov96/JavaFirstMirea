package ru.mirea.task26;

public class NotEnoughFundsToPayException extends Exception {
    NotEnoughFundsToPayException(String errorMessage)
    {
        super(errorMessage);
    }
}
