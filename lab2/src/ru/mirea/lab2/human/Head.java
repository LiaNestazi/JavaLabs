package ru.mirea.lab2.human;

public class Head {
    private double circum;
    public Head(){
        circum=55;
    }
    public Head(double circum){
        this.circum=circum;
    }
    public void setCircum(double circum){
        this.circum=circum;
    }
    public double getCircum(){
        return circum;
    }
}
