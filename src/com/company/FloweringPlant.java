package com.company;

public class FloweringPlant extends Plant {
    private boolean isPoisonous;
    public FloweringPlant(String commonName, String latinName, boolean isPoisonous) {
        super(commonName, latinName);
        this.isPoisonous = isPoisonous;
    }

    @Override
    public boolean canHurtYou() {
        return false;
    }

    @Override
    public String getTypeOfHurting() {
        return "by being poisonous";
    }
}
