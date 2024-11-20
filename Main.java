package org.athul.service;

import org.athul.service.Vehicle.Bikes;
import org.athul.service.Vehicle.Cars;
import org.athul.service.Vehicle.Truck;
import org.athul.service.Vehicle.Vehicle;

public class Main {
    public static void main(String[] args) {
        Lot parkingLot= Lot.getInstance();
        parkingLot.addLevel(new Level(1, 10));
        parkingLot.addLevel(new Level(2, 10));

        Vehicle car = new Cars("ABC123");
        Vehicle car2 = new Cars("ABC123");
        Vehicle car3 = new Cars("ABC123");
        Vehicle car4 = new Cars("ABC123");
        Vehicle car5 = new Cars("ABC123");
        Vehicle car6 = new Cars("ABC123");
        Vehicle car7 = new Cars("ABC123");
        Vehicle car8 = new Cars("ABC124");
        Vehicle car9 = new Cars("ABC125");
        Vehicle car10 = new Cars("ABC126");
        Vehicle car11 = new Cars("ABC127");
        Vehicle car12 = new Cars("ABC128");

        Vehicle truck = new Truck("XYZ789");
        Vehicle motorcycle = new Bikes("M1234");

        // Park vehicles
        parkingLot.parkVehicle(car);
        parkingLot.parkVehicle(car2);
        parkingLot.parkVehicle(car3);
        parkingLot.parkVehicle(car4);
        parkingLot.parkVehicle(car5);
        parkingLot.parkVehicle(car6);
        parkingLot.parkVehicle(car7);
        parkingLot.parkVehicle(car8);
        parkingLot.parkVehicle(car9);
        parkingLot.parkVehicle(car10);
        parkingLot.parkVehicle(car11);
        parkingLot.parkVehicle(car12);
        parkingLot.parkVehicle(truck);
        parkingLot.parkVehicle(motorcycle);

        // Display availability
        parkingLot.displayAvailabilty();

        // Unpark vehicle
        parkingLot.unparkVehicle(motorcycle);

        // Display updated availability
        parkingLot.displayAvailabilty();
    }
}