package com.company;

public class Tree extends Plant {
    boolean hasPoisonousFruits;

    public Tree(String commonName, String latinName, boolean hasPoisonousFruits) {
        super(commonName, latinName);
        this.hasPoisonousFruits = hasPoisonousFruits;
    }

    @Override
    public boolean canHurtYou() {
        return hasPoisonousFruits;
    }

    @Override
    public String getTypeOfHurting() {
        return "with it's posinous fruits";
    }
}
