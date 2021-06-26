package com.company;

public class Main {

    public static void main(String[] args) {
	    Car car1 = new Car();
	    car1.registrationNumber = "112GPU";
	    car1.tankCapacity = 100.0;
	    car1.color = "Black";
	    car1.combustion = 10.0;
	    car1.tankCondition = 9.0;
	    car1.doorNumber = 3.0;
	    car1.price = 100.0;
	    car1.refuel(car1.tankCondition, 100.0, car1.tankCapacity);
	    car1.changeColor("Red");
    }
}
