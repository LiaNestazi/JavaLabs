package ru.mirea.lab4;

public class Animal implements Nameable{
    private String name;
    private String furcolor;

    public void setName(String name) {
        this.name = name;
    }

    public void setFurcolor(String furcolor) {
        this.furcolor = furcolor;
    }

    public String getName() {
        return name;
    }

    public String getFurcolor() {
        return furcolor;
    }

    public String toString() {
        return "Name:"+name+" Fur Color:"+furcolor;
    }
}
