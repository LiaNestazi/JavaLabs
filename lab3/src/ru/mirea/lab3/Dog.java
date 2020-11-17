package ru.mirea.lab3;

public abstract class Dog {
    protected double height;
    protected double weight;
    protected String fur;
    public Dog(){
        height=50;
        weight=15;
        fur="short";
    }
    public Dog(double height,double weight,String fur){
        this.height=height;
        this.weight=weight;
        this.fur=fur;
    }
    public double getHeight() {
        return height;
    }
    public void setHeight(double height){ this.height=height; }
    public double getWeight() { return weight; }
    public void setWeight(double weight){
        this.weight=weight;
    }
    public String getFur() {
        return fur;
    }
    public void setFur(String fur){
        this.fur=fur;
    }
    public abstract String getActivity();
    public abstract String getAbilityToTrain();
    public abstract String getFriendliness();
    public String toString(){
        return "Height:"+this.height+" Weight:"+this.weight+" Fur:"+this.fur;
    }
}
