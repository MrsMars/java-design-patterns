package com.aoher.model;

import com.aoher.model.abstracts.Drivable;

public class FullWheelDrive implements Drivable {

    @Override
    public void drive() {
        System.out.println("Full wheel drive");
    }
}
