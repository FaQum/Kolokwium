package com.company;

public abstract class Vehicle {
    String registrationNumber;
    String vinNumber;
    String color;
    Double price;
    Double combustion;
    Double tankCondition;
    Double mileageCounter;

    public void refuel() {
        System.out.println("Zatankuj");
    }

    public void drive() {
        System.out.println("Jedź");
    }

    public void range() {
        double range = tankCondition / combustion;
    }
}