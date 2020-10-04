package ru.mirea.lab4;

public class Car implements Nameable{
    private String name;
    private int x,y;
    private int speed;

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
