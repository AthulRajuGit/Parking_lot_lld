package org.athul.service;
import org.athul.service.Vehicle.Vehicle;
import org.athul.service.Vehicle.VehicleType;

public class Spot {


    private final int spotNumber;
    private final VehicleType vehicleType;

    private Vehicle parkedVehicle;

    public Spot(int spotNumber,VehicleType vehicelType){
        this.spotNumber=spotNumber;
        this.vehicleType=vehicelType;
    }

    public boolean isAvailable() {
        return parkedVehicle==null;
    }

    public VehicleType getvehicleType() {
     return vehicleType;
    }

    public void parkVehicle(Vehicle vehicle) {
        if(isAvailable() && vehicle.getType()==vehicleType){
            parkedVehicle=vehicle;

        }else{
        throw new IllegalArgumentException("not possible ");
        }
    }


    public void unparkVechicle() {
        parkedVehicle=null;
    }


    public Vehicle getParkedVehicle() {
            return parkedVehicle;
    }

    public int getVehicleNumber() {
        return spotNumber;
    }
}
