package ru.mirea.lab3;

public class AkitaInu extends Dog{
    public AkitaInu(){
        height=65;
        weight=30;
        fur="long";
    }
    public AkitaInu(double height,double weight,String fur) {
        this.height=height;
        this.weight=weight;
        this.fur=fur;
    }
    public String getActivity(){
        return "5/5";
    }
    public String getAbilityToTrain(){
        return "2/5";
    }
    public String getFriendliness(){
        return "3/5";
    }
    public String toString(){
        return "Height:"+this.height+" Weight:"+this.weight+" Fur:"+this.fur+
                "\nActivity:"+getActivity()+
                "\nAbility to train:"+getAbilityToTrain()+
                "\nFriendliness:"+getFriendliness();
    }
}
