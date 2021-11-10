package ru.mirea.task14.Drunkard;
import java.util.Scanner;
import java.util.Queue;
import java.util.LinkedList;

public class Drunkard {
    private Queue<Integer> firstCards = new LinkedList<Integer>();
    private Queue<Integer> secondCards = new LinkedList<Integer>();

    public void play() {
        fill_in();
        compare();
    }

    public void fill_in() {
        Scanner console = new Scanner(System.in);

        for (int i = 0; i < 5; i++) {
            this.firstCards.add(console.nextInt());
        }
        for (int i = 0; i < 5; i++) {
            this.secondCards.add(console.nextInt());
        }
    }

    public void compare() {
        int n = 0;
        while (firstCards.peek() != null && secondCards.peek() != null && n < 106) {
            n++;
            int firstCard = this.firstCards.poll();
            int secondCard = this.secondCards.poll();
            if (firstCard == 0 && secondCard == 9) {
                firstCards.add(firstCard);
                firstCards.add(secondCard);
            }
            else if (firstCard == 9 && secondCard == 0) {
                secondCards.add(firstCard);
                secondCards.add(secondCard);
            }
            else if (firstCard > secondCard) {
                firstCards.add(firstCard);
                firstCards.add(secondCard);
            }
            else {
                secondCards.add(firstCard);
                secondCards.add(secondCard);
            }
        }
        if (firstCards.peek() == null) {
            System.out.println("second " + n);
        }
        else if (secondCards.peek() == null) {
            System.out.println("first " + n);
        }
        else {
            System.out.println("botva");
        }
    }
    public static void main(String[] args) {
        Drunkard game = new Drunkard();
        game.play();
    }
}
