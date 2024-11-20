package org.athul.service;


import org.athul.service.Vehicle.Vehicle;

import java.util.*;

/*
 *
 * this class maintains the lot
 *
 *
 */

public class Lot {

  private  final List<Level> levels;
  private static  Lot instance;

  private Lot(){
      levels= new ArrayList<>();
  }

  public static synchronized  Lot getInstance(){
      if(instance==null){
          instance=new Lot();
      }
      return instance;
  }
    /*
     *
     * this method CRUD operation in level
     *
     *
     */
  public void addLevel(Level level){
      levels.add(level);
  }


    /*
     *
     * this method pakr the vehicle
     *
     *
     */
  public boolean parkVehicle(Vehicle vehicle){
      for(Level level :levels){
         if(level.parkVehicle(vehicle)){
             System.out.println("parked successfully");
             return true;
         }

      }
      System.out.println("no parking allowed  for vehicle :" + vehicle.getLicenseplate());
      return false;
  }
    /*
     *
     * this method unparks the vehicle
     *
     *
     */
  public  boolean unparkVehicle(Vehicle vehicle){
      for(Level level :levels){
          if(level.unParkVehicle(vehicle)){
              System.out.println("un parked successfully");
              return true;
          }

      }
      System.out.println("no parking allowed ");
      return false;
  }

  /*
  *
  * this method display availability
  *
  *
   */
  public void displayAvailabilty(){
        for(Level level:levels){
            level.displayAvailbility();
        }
  }




}
