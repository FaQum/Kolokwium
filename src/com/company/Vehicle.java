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
            System.out.println("Nie można zatankować więcej niż pojemność zbiornika");
        } else if(tankCondition + fuelAmount <= tankCapacity) {
            System.out.println("Paliwo zostało zatankowane");
        }
    }



    public void range(Double tankCondition, Double combustion) {
        double range = tankCondition / combustion;
        System.out.println(range);
    }

    public void changeColor(String finalColor) {
        color = finalColor;
        price = price+0.05 * price;
        System.out.println("Cena samochodu wzrosla do: " + price);
    }
}