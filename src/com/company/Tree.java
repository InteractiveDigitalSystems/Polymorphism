package com.company;

public class Tree extends Plant implements Danger {
    boolean hasPoisonousFruits;

    public Tree(String commonName, String latinName, boolean hasPoisonousFruits) {
        super(commonName, latinName);
        this.hasPoisonousFruits = hasPoisonousFruits;
    }

    public boolean canHurtYou() {
        return hasPoisonousFruits;
    }

    public String getTypeOfHurting() {
        return "with it's posinous fruits";
    }
}
