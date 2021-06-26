package com.company;

public class Main {

    public static void main(String[] args) {
	    Car car1 = new Car();
        car1.registrationNumber = "GPU5T13";
        car1.vinNumber = "BLABLA123123";
        car1.color = "Black";
        car1.price = 1000000.0;
        car1.combustion = 25.5;
        car1.tankCondition = 10.0;
        car1.tankCapacity = 100.0;
        car1.mileageCounter = 10540.0;
        car1.doorNumber = 2.0;

        Car car2 = new Car();
        car2.registrationNumber = "GWE43G8";
        car2.vinNumber = "1234513FRWR23";
        car2.color = "Red";
        car2.price = 74340.0;
        car2.combustion = 10.0;
        car2.tankCondition = 90.5;
        car2.tankCapacity = 120.0;
        car2.mileageCounter = 75549.0;
        car2.doorNumber = 4.0;

        Truck truck1 = new Truck();
        truck1.registrationNumber = "GDA346G";
        truck1.vinNumber = "LALALA123123";
        truck1.color = "Blue";
        truck1.price = 2500000.0;
        truck1.combustion = 60.7;
        truck1.tankCondition = 278.0;
        truck1.tankCapacity = 350.0;
        truck1.mileageCounter = 78.0;
        truck1.capacity = 150.5;

        Truck truck2 = new Truck();
        truck2.registrationNumber = "WE1234B";
        truck2.vinNumber = "GITHUB033312";
        truck2.color = "Yellow";
        truck2.price = 50000.02;
        truck2.combustion = 25.0;
        truck2.tankCondition = 149.0;
        truck2.tankCapacity = 149.0;
        truck2.mileageCounter = 90.4;
        truck2.capacity = 353.6;

        Motorcycle motorcycle1 = new Motorcycle();
        motorcycle1.registrationNumber = "WSB7590";
        motorcycle1.vinNumber = "0978798hkjbnm";
        motorcycle1.color = "Green";
        motorcycle1.price = 8000.9;
        motorcycle1.combustion = 5.0;
        motorcycle1.tankCondition = 40.0;
        motorcycle1.tankCapacity = 100.0;
        motorcycle1.mileageCounter = 10540.0;
        motorcycle1.yearOfProduction = 1958;

        Motorcycle motorcycle2 = new Motorcycle();
        motorcycle2.registrationNumber = "IEMD7V";
        motorcycle2.vinNumber = "PROSZEOPIATECZKE123";
        motorcycle2.color = "PurpleSnake";
        motorcycle2.price = 9000000.0;
        motorcycle2.combustion = 86.9 ;
        motorcycle2.tankCondition = 0.78;
        motorcycle2.tankCapacity = 99.0;
        motorcycle2.mileageCounter = 6666.6;
        motorcycle2.yearOfProduction = 1989;

        motorcycle2.refuel(motorcycle2.tankCondition, 100.0, motorcycle2.tankCapacity);

        car1.changeColor("RedDragon");

        truck2.range(truck2.tankCondition, truck2.combustion);

    }
}
