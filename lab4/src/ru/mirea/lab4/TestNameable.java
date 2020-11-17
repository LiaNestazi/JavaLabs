package ru.mirea.lab4;

public class TestNameable {
    public static void main(String[] args) {
        Planet earth=new Planet();
        Car mycar=new Car("Hyundai",2,5,80);
        Animal cat =new Animal("Cat","black");
        System.out.println(earth);
        System.out.println(mycar);
        System.out.println(cat);
        System.out.println("Planet name:"+earth.getName());
        System.out.println("Car name:"+ mycar.getName());
        System.out.println("Animal name:"+cat.getName());
    }
}
