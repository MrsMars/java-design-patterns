package com.aoher.processor;

import com.aoher.model.BasicCar;

public class CentralProcessor {

    private BasicCar car;

    public CentralProcessor(BasicCar car) {
        this.car = car;
    }

    public void work() {
        car.drive();
        car.xenonOn();
        car.xenonOff();
    }
}
