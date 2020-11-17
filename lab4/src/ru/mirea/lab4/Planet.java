package ru.mirea.lab4;

public class Planet implements Nameable{
    private String name;
    private double angle;
    private int speed;
    public Planet(){
        name="Earth";
        angle=23.5;
        speed=1675;
    }
    public Planet(String name, double angle, int speed){
        this.name=name;
        this.angle=angle;
        this.speed=speed;
    }
    public void setName(String name) {
        this.name = name;
    }

    public void setAngle(double angle) {
        this.angle = angle;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public String getName() {
        return name;
    }

    public int getSpeed() {
        return speed;
    }

    public double getAngle() {
        return angle;
    }

    public String toString() {
        return "Name:"+name+" Angle:"+angle+" Speed:"+speed;
    }
}
