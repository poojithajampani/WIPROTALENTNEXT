package com.automobile.twowheeler;

import com.automobile.Vehicle;

public class Hero extends Vehicle {

    @Override
    public String getModelName() {
        return "Hero Splendor";
    }

    @Override
    public String getRegistrationNumber() {
        return "AP39AB1234";
    }

    @Override
    public String getOwnerName() {
        return "Pooja";
    }

    public int getSpeed() {
        return 70;
    }

    public void radio() {
        System.out.println("Radio is ON");
    }
}
