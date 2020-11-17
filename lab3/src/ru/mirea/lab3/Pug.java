package ru.mirea.lab3;

public class Pug extends Dog{
    protected String eartype;
    protected String muztype;
    public Pug(){
        height=30;
        weight=6;
        fur="short";
        eartype="hanging";
        muztype="flattened";
    }
    public Pug(double height,double weight,String fur, String eartype, String muztype){
        this.height=height;
        this.weight=weight;
        this.fur=fur;
        this.eartype=eartype;
        this.muztype=muztype;
    }
    public void setEartype(String eartype) {
        this.eartype = eartype;
    }
    public void setMuztype(String muztype) {
        this.muztype = muztype;
    }
    public String getEartype() {
        return eartype;
    }
    public String getMuztype() {
        return muztype;
    }
    public String getActivity(){ return "3/5"; }
    public String getAbilityToTrain(){ return "2/5"; }
    public String getFriendliness(){ return "4/5"; }
    public String toString(){
        return "Height:"+this.height+" Weight:"+this.weight+" Fur:"+this.fur+" Ears Type:"+this.eartype+" Muzzle Type:"+this.muztype+
                "\nActivity:"+getActivity()+
                "\nAbility to train:"+getAbilityToTrain()+
                "\nFriendliness:"+getFriendliness();
    }
}
