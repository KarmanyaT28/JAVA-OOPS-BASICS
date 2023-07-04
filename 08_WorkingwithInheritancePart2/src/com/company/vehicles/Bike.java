package com.company.vehicles;

import com.company.parent.Vehicle;

public class Bike extends Vehicle {
    public String handle;

    public Bike(){
        super();
        this.handle = "Short";
    }

    public Bike(String handle , String engine , int wheels , int seats , int fuelTank , String lights){
        super(engine , wheels , seats , fuelTank , lights);
        this.handle = handle;
    }

    @Override
    public String toString() {
        return "Bike{" +
                "handle='" + handle + '\'' +
                '}';
    }

    public String getHandle() {
        return handle;
    }

    public void run(){
        System.out.println("Running Bike");
        System.out.println(toString());
    }

}
