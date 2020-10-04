package ru.mirea.lab2.human;

import ru.mirea.lab2.human.Hand;
import ru.mirea.lab2.human.Head;
import ru.mirea.lab2.human.Human;
import ru.mirea.lab2.human.Leg;

public class TestHuman {
    public static void main(String[] args){
        Human h1 = new Human();
        Human h2 = new Human();
        Head head = new Head();
        head.setCircum(35);
        Leg leg = new Leg();
        leg.setLength(130);
        Hand hand = new Hand();
        hand.setLength(15);
        h1.setHead(head);
        h1.setHand(hand);
        h1.setLeg(leg);
        System.out.println("First human:"+"\nHead:"+h1.getHead().getCircum()+" Leg:"+h1.getLeg().getLength()+
                " Hand:"+h1.getHand().getLength());
        h2.setLeg(h1.getLeg());
        h2.setHead(h1.getHead());
        Hand hand2 = new Hand();
        hand2.setLength(18.5);
        h2.setHand(hand2);
        System.out.println("Second human:"+"\nHead:"+h2.getHead().getCircum()+" Leg:"+h2.getLeg().getLength()+
                " Hand:"+h2.getHand().getLength());
    }
}
