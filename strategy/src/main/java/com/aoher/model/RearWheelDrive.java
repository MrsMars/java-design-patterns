package com.aoher.model;

import com.aoher.model.abstracts.Drivable;

public class RearWheelDrive implements Drivable {

    @Override
    public void drive(){
        System.out.println("Rear wheel drive");
    }
}
