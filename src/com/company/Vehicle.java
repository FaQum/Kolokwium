package com.company;

public abstract class Vehicle {
    String registrationNumber;
    String vinNumber;
    String color;
    Double price;
    Double combustion;
    Double tankCondition;
    Double mileageCounter;

    public double refuel(Double fuel) {
        return tankCondition - fuel;
    }

    public void drive(Double kilometers, Double range) {

    }

    public void range() {
        double range = tankCondition / combustion;
    }
}