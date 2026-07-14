package com.automobile.fourwheeler;

import com.automobile.Vehicle;

public class Ford extends Vehicle {

    @Override
    public String getModelName() {
        return "Ford EcoSport";
    }

    @Override
    public String getRegistrationNumber() {
        return "AP39GH5678";
    }

    @Override
    public String getOwnerName() {
        return "Kiran";
    }

    public int speed() {
        return 140;
    }

    public int tempControl() {
        return 24;
    }
}
