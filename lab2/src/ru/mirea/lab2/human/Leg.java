package ru.mirea.lab2.human;

public class Leg {
    private double length;
    public Leg(){
        length=90;
    }
    public Leg(double length){
        this.length=length;
    }
    public void setLength(double length){
        this.length=length;
    }
    public double getLength(){
        return length;
    }
}
