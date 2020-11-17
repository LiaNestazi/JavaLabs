package ru.mirea.lab2.human;

public class Human {
    private Head head;
    private Leg leg;
    private Hand hand;
    public Human(){
        head = new Head();
        leg = new Leg();
        hand = new Hand();
    }
    public Human(double headCircum, double legLength, double handLength){
        head=new Head(headCircum);
        leg=new Leg(legLength);
        hand=new Hand(handLength);
    }
    public void setHead(Head head){
        this.head=head;
    }
    public void setLeg(Leg leg){
        this.leg=leg;
    }
    public void setHand(Hand hand){
        this.hand=hand;
    }
    public Head getHead(){
        return head;
    }
    public Leg getLeg(){
        return leg;
    }
    public Hand getHand(){
        return hand;
    }
    public String toString(){ return "Head circum:"+head.getCircum()+" Leg length:"+leg.getLength()+" Hand length:"+hand.getLength(); }
}
