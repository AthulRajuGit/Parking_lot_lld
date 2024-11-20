package org.athul.service.Vehicle;

public abstract class Vehicle {

    protected  String licenseplate;

    protected  VehicleType vehicleType;


    public Vehicle(String licenseplate,VehicleType vehicleType){
        this.vehicleType=vehicleType;
        this.licenseplate=licenseplate;
    }

    public VehicleType getType() {
         return  vehicleType;
    }
    public String getLicenseplate(){
        return licenseplate;
    }
}
