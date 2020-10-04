package ru.mirea.lab2.human;

public class Human {
    private Head head = new Head();
    private Leg leg = new Leg();
    private Hand hand = new Hand();
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
}
