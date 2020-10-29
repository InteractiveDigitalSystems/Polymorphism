package com.company;

public class FloweringPlant extends Plant implements Danger {
    private boolean isPoisonous;
    public FloweringPlant(String commonName, String latinName, boolean isPoisonous) {
        super(commonName, latinName);
        this.isPoisonous = isPoisonous;
    }

    public boolean canHurtYou() {
        return false;
    }

    public String getTypeOfHurting() {
        return "by being poisonous";
    }
}
