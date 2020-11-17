package ru.mirea.lab3;

public class CockerSpaniel extends Dog {
    protected String furtype;
    public CockerSpaniel(){
        height=39;
        weight=13;
        fur="long";
        furtype="curly";
    }
    public CockerSpaniel(double height,double weight,String fur, String furtype){
        this.height=height;
        this.weight=weight;
        this.fur=fur;
        this.furtype=furtype;
    }
    public void setFurtype(String furtype) {
        this.furtype = furtype;
    }
    public String getFurtype() {
        return furtype;
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
        return "Height:"+this.height+" Weight:"+this.weight+" Fur:"+this.fur+" Fur Type:"+this.furtype+
                "\nActivity:"+getActivity()+
                "\nAbility to train:"+getAbilityToTrain()+
                "\nFriendliness:"+getFriendliness();
    }
}
