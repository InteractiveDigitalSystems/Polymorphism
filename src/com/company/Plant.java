package com.company;

public abstract class Plant {
    String commonName;
    String latinName;

    Plant(String commonName, String latinName) {
        this.commonName = commonName;
        this.latinName = latinName;
    }

    public String getCommonName() {
        return commonName;
    }

    public String getLatinName() {
        return latinName;
    }

    abstract public boolean canHurtYou();

    public abstract String getTypeOfHurting();
}
