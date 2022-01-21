package com.careerdevs.animalfactory;

import javax.naming.Name;

public class Animal {
    //These are the 3 fields below
    public String species;
    public short legs;
    public boolean livesOnLand;

    //constructor
    public Animal (String species, short legs, boolean livesOnLand) {
        this.species = species;
        this.legs = legs;
        this.livesOnLand = livesOnLand;
    }

    //auto-generated toString method.. What's the purpose of the toString?
    @Override
    public String toString() {
        return "Animal{" +
                "species='" + species + '\'' +
                ", legs=" + legs +
                ", livesOnLand=" + livesOnLand +
                '}';
    }
}
