package com.company;

public abstract class Vehicle {
    String registrationNumber;
    String vinNumber;
    String color;
    Double price;
    Double combustion;
    Double tankCondition;
    Double tankCapacity;
    Double mileageCounter;

    public void refuel(Double tankCondition, Double fuelAmount, Double tankCapacity) {
        if(tankCondition + fuelAmount > tankCapacity) {
            tankCondition = tankCapacity;
            System.out.println("Nie można zatankować więcej niż pojemność zbiornika");
        } else if(tankCondition + fuelAmount <= tankCapacity) {
            tankCondition = tankCondition + fuelAmount;
            System.out.println("Paliwo zostało zatankowane");
        }
    }

    public void drive(Double kilometers, Double range) {

    }

    public void range() {
        double range = tankCondition / combustion;
    }

    public void changeColor(String finalColor) {
        color = finalColor;
        price = price+0.05 * price;
        System.out.println(price);
    }
}