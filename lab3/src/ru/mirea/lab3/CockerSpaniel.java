package ru.mirea.lab3;

public class CockerSpaniel extends Dog {
    protected String furtype;
    public CockerSpaniel(){
        height=39;
        weight=13;
        fur="long";
        furtype="curly";
    }
    public CockerSpaniel(int height,int weight,String fur, String furtype){
        this.height=height;
        this.weight=weight;
        this.fur=fur;
        this.furtype=furtype;
    }
    public String getActivity(){
        return "4/5";
    }
    public String getAbilityToTrain(){
        return "4/5";
    }
    public String getFriendliness(){
        return "3/5";
    }
    public String toString(){
        return "Height:"+this.height+" Weight:"+this.weight+" Fur:"+this.fur+" Fur Type:"+this.furtype;
    }
}
