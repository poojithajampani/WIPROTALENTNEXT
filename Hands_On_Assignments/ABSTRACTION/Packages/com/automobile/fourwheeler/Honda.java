package com.automobile.fourwheeler;

import com.automobile.Vehicle;

public class Honda extends Vehicle {

    @Override
    public String getModelName() {
        return "Honda City";
    }

    @Override
    public String getRegistrationNumber() {
        return "AP39CD5678";
    }

    @Override
    public String getOwnerName() {
        return "Rahul";
    }

    public int getSpeed() {
        return 120;
    }

    public void cdplayer() {
        System.out.println("CD Player is ON");
    }
}
