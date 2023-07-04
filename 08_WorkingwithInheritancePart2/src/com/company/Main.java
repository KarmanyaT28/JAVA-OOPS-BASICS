package com.company;

import com.company.vehicles.Bike;

public class Main {

    public static void main(String[] args) {
	    Bike bike = new Bike("long" ,"Diesel" , 4,4, 40 , "LED" );
//        System.out.println("Handle" + bike.getHandle());
//        System.out.println("Engine type" + bike.getEngine());
//        System.out.println("Number of seats" + bike.getSeats());
//        System.out.println("Fuel Tank Capacity" + bike.getFuelTank());
//        System.out.println("Head lamp type" + bike.getLights());
//        System.out.println("Number of wheels" + bike.getWheels());
//        System.out.println(bike);
        bike.run();
    }
}
