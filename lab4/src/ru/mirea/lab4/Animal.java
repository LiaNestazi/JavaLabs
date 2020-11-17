package ru.mirea.lab4;

public class Animal implements Nameable{
    private String name;
    private String furcolor;
    public Animal(){
        name="basic";
        furcolor="black";
    }
    public Animal(String name, String furcolor){
        this.name=name;
        this.furcolor=furcolor;
    }
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
