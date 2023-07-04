package com.company;

import com.company.vehicles.Bike;

public class Main {

    public static void main(String[] args) {
	    Bike bike = new Bike();
//        bike.handle = "Short";
//        bike.engine = "petrol";
//        System.out.println(bike.engine);
//        System.out.println(bike.lights);
        System.out.println(bike.getHandle());
        System.out.println(bike.getEngine());
    }
}
