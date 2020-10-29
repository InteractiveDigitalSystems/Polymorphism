package com.company;

public class Tree extends Plant {
    boolean hasPoisonousFruits;
    int averageNumberOfLeaves;

    public Tree(String commonName, String latinName, boolean hasPoisonousFruits, int averageNumberOfLeaves ) {
        super(commonName, latinName);
        this.hasPoisonousFruits = hasPoisonousFruits;
        this.averageNumberOfLeaves = averageNumberOfLeaves;
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
