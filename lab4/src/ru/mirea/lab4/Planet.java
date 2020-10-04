package ru.mirea.lab4;

public class Planet implements Nameable{
    private String name;
    private double angle;
    private int speed;

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
