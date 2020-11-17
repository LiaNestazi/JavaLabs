package ru.mirea.lab4;

public class Car implements Nameable{
    private String name;
    private int x,y;
    private int speed;
    public Car(){
        name="basic";
        x=0;
        y=0;
        speed=0;
    }
    public Car(String name,int x, int y, int speed){
        this.name=name;
        this.x=x;
        this.y=y;
        this.speed=speed;
    }
    public int getSpeed() {
        return speed;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public String getName() {
        return name;
    }

    public void move(int dx, int dy){
        x+=dx;
        y+=dy;
    }

    public String toString() {
        return "Name:"+name+" X:"+x+" Y:"+y+" Speed:"+speed;
    }
}
