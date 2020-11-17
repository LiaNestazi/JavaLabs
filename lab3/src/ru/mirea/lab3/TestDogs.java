package ru.mirea.lab3;

public class TestDogs {
    public static void main(String[] args) {
        Pug pug =new Pug();
        AkitaInu ai =new AkitaInu();
        CockerSpaniel cs=new CockerSpaniel();
        pug.setEartype("straight");
        ai.setHeight(30);
        cs.setWeight(20.6);
        cs.setFurtype("wavy");
        Mongrel mongrel =new Mongrel();
        System.out.println(pug);
        System.out.println(ai);
        System.out.println(cs);
        System.out.println(mongrel);
    }
}
