package ru.mirea.task3.Human;

public class Human {
    protected Head head;
    protected Leg leg;
    protected Hand hand;
    public Human(Head h, Leg l, Hand he) {
        this.head = h;
        this.leg = l;
        this.hand = he;
    }

    public Head getHead() {
        return head;
    }

    public void setHead(Head head) {
        this.head = head;
    }

    public Leg getLeg() {
        return leg;
    }

    public void setLeg(Leg leg) {
        this.leg = leg;
    }

    public Hand getHand() {
        return hand;
    }

    public void setHand(Hand hand) {
        this.hand = hand;
    }
    public static void main(String[] args) {
        Head head = new Head(8);
        Leg leg = new Leg(50);
        Hand hand = new Hand(40);
        Human human = new Human(head, leg, hand);

        System.out.println("Размер головы " +human.getHead().size);
        System.out.println("Длина ноги " + human.getHand().width);
        System.out.println("Ширина головы " +human.getLeg().length + '\n');

        Head head_2 = new Head(9);
        Leg leg_2 = new Leg(70);
        Hand hand_2 = new Hand(60);

        human.setHand(hand_2);
        human.setHead(head_2);
        human.setLeg(leg_2);

        System.out.println("Размер головы " +human.getHead().size);
        System.out.println("Длина ноги " + human.getHand().width);
        System.out.println("Ширина головы " +human.getLeg().length);
    }
}

class Head{
    protected int size;

    public Head(int size) {
        this.size = size;
    }
}

class Leg{
    protected int length;

    public Leg(int length) {
        this.length = length;
    }
}

class Hand{
    protected int width;

    public Hand(int width) {
        this.width = width;
    }
}
