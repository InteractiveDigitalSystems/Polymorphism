package com.company;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Plant> plants = new ArrayList<Plant>();

        // Adding cacti
        plants.add(new Cactus("Bishop's cap", "Astrophytum myriostigma", 0));
        plants.add(new Cactus("Saguaro", "Carnegiea gigantea", 7));
        plants.add(new Cactus("Jumping Cholla", "Cylindropuntia fulgida", 3));

        // Adding Flowering Plants
        plants.add(new FloweringPlant("Lily of the valley", "Convallaria majalis", true));
        plants.add(new FloweringPlant("Fireweed", "Chamaenerion angustifolium", false));

        // Add trees
        plants.add(new Tree("Manchineel", "Hippomane mancinella", true, 3800));
        plants.add(new Tree("Apple Tree", "Malus domestica)", false, 6300));

        // For-each loop
        for (Plant specimen : plants) {
            printPlantInfo(specimen);
        }
    }

    public static void printPlantInfo(Plant specimen) {
        String description = String.format("The %s (%s)", specimen.getCommonName(), specimen.getLatinName());
        if (specimen.canHurtYou()) {
            description += " can hurt you with " + specimen.getTypeOfHurting() + "!";
        } else {
            description += " can't hurt you!";
        }
        System.out.println(description);
    }
}

