package com.automobile.fourwheeler;

import com.automobile.Vehicle;

public class Logan extends Vehicle {

    @Override
    public String getModelName() {
        return "Logan";
    }

    @Override
    public String getRegistrationNumber() {
        return "AP39EF1234";
    }

    @Override
    public String getOwnerName() {
        return "Ravi";
    }

    public int speed() {
        return 100;
    }

    public int gps() {
        return 1;
    }
}
