package ru.mirea.lab2.human;

public class Hand {
    private double length;
    public Hand(){
        length=18;
    }
    public Hand(double length){
        this.length=length;
    }
    public void setLength(double length){
        this.length=length;
    }
    public double getLength(){
        return length;
    }
}
