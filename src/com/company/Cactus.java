package com.company;

public class Cactus extends Plant {
    int maxSpineLength; // centimeter
    public Cactus(String commonName, String latinName, int maxSpineLength) {
        super(commonName, latinName);
        this.maxSpineLength = maxSpineLength;
    }

    public boolean isSpiky(){
        return maxSpineLength > 0;
    }

    @Override
    public boolean canHurtYou() {
        return isSpiky();
    }

    @Override
    public String getTypeOfHurting() {
        return "with it's spiky spines";
    }
}
