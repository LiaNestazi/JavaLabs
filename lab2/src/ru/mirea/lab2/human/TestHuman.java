package ru.mirea.lab2.human;

public class TestHuman {
    public static void main(String[] args){
        Human h1 = new Human();
        Human h2 = new Human(55, 90, 15);
        Head head = new Head();
        Leg leg = new Leg();
        Hand hand = new Hand();
        head.setCircum(59);
        leg.setLength(98);
        hand.setLength(18);
        h1.setHead(head);
        h1.setLeg(leg);
        h1.setHand(hand);
        System.out.println("First human:\n"+h1);
        System.out.println("Second human:\n"+h2);
    }
}
