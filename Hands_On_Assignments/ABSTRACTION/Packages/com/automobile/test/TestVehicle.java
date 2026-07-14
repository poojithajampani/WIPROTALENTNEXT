package com.automobile.test;

import com.automobile.twowheeler.Hero;
import com.automobile.fourwheeler.Honda;
import com.automobile.fourwheeler.Logan;
import com.automobile.fourwheeler.Ford;

public class TestVehicle {

    public static void main(String[] args) {

        // Hero
        Hero hero = new Hero();

        System.out.println("----- Hero -----");
        System.out.println("Model Name : " + hero.getModelName());
        System.out.println("Registration Number : " + hero.getRegistrationNumber());
        System.out.println("Owner Name : " + hero.getOwnerName());
        System.out.println("Speed : " + hero.getSpeed() + " km/h");
        hero.radio();

        System.out.println();

        // Honda
        Honda honda = new Honda();

        System.out.println("----- Honda -----");
        System.out.println("Model Name : " + honda.getModelName());
        System.out.println("Registration Number : " + honda.getRegistrationNumber());
        System.out.println("Owner Name : " + honda.getOwnerName());
        System.out.println("Speed : " + honda.getSpeed() + " km/h");
        honda.cdplayer();

        System.out.println();

        // Logan
        Logan logan = new Logan();

        System.out.println("----- Logan -----");
        System.out.println("Model Name : " + logan.getModelName());
        System.out.println("Registration Number : " + logan.getRegistrationNumber());
        System.out.println("Owner Name : " + logan.getOwnerName());
        System.out.println("Speed : " + logan.speed() + " km/h");
        System.out.println("GPS : " + logan.gps());

        System.out.println();

        // Ford
        Ford ford = new Ford();

        System.out.println("----- Ford -----");
        System.out.println("Model Name : " + ford.getModelName());
        System.out.println("Registration Number : " + ford.getRegistrationNumber());
        System.out.println("Owner Name : " + ford.getOwnerName());
        System.out.println("Speed : " + ford.speed() + " km/h");
        System.out.println("Temperature Control : " + ford.tempControl());
    }
}