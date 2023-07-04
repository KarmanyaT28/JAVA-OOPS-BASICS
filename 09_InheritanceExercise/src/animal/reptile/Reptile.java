package animal.reptile;

import animal.Animal;

public class Reptile extends Animal{
    protected String skin,egg;
    protected boolean backbone;

    public Reptile(){
        heightInFeet = 5;
        weightInKilos = 20;
        animalType = "Reptile";
        bloodType = "Cold";
        this.skin = "Dry Skin";
        this.backbone = true;
        this.egg = "soft shelled";
    }
}
