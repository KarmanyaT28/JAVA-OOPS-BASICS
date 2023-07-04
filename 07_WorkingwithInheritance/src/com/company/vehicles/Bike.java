package com.company.vehicles;

import com.company.parent.Vehicle;

public class Bike extends Vehicle {
    public String handle;

    public Bike(){
        super();
        this.handle = "Short";
    }

    public Bike(String handle){
        super();
        this.handle = handle;
    }

    public String getHandle() {
        return handle;
    }

    public void setHandle(String handle) {
        this.handle = handle;
    }
}
