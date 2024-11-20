package org.athul.service;

import org.athul.service.Vehicle.Vehicle;
import org.athul.service.Vehicle.VehicleType;

import java.util.*;


public class Level {

    private final int floor;
    private final List<Spot> spots;


    public  Level(int floor,int numSpots){
        this.floor=floor;
        spots= new ArrayList<>(numSpots);

        double ratioofBikes= 0.50;
        double ratioofCars=0.40;

        int numofBikes=(int) (numSpots*ratioofBikes);
        int numofCars=(int)(numSpots*ratioofCars);

        for(int i=1;i<=numofBikes;i++){
            spots.add(new Spot(i,VehicleType.BIKE));
        }
        for(int i=numofBikes+1;i<=numofCars+numofBikes;i++){
            spots.add(new Spot(i,VehicleType.CAR));
        }
        for(int i=numofBikes+numofCars+1;i<=numSpots;i++){
            spots.add(new Spot(i, VehicleType.TRUCK));
        }

    }




    public synchronized boolean parkVehicle(Vehicle vehicle) {
        for(Spot spot:spots){
            if(spot.isAvailable() && spot.getvehicleType() == vehicle.getType()){
                spot.parkVehicle(vehicle);
                return true;
            }

        }
        return false;
    }


    public synchronized boolean unParkVehicle(Vehicle vehicle) {
        for(Spot spot:spots){
            if(!spot.isAvailable() && spot.getParkedVehicle().equals(vehicle)){
                spot.unparkVechicle();
                return true;
            }

        }
        return false;
    }

    public void displayAvailbility() {
        System.out.println("current floor " +floor+" availability");
        for(Spot spot:spots){
            System.out.println("Spot "+ "requested is " +(spot.isAvailable()?"Available for " : "occupied by") + " " +spot.getVehicleNumber());
        }
    }

}
