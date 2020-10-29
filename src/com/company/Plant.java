package com.company;

public abstract class Plant implements Danger{
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

}
