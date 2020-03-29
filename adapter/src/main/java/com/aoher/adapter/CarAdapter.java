package com.aoher.adapter;

import com.aoher.model.BasicCar;
import com.aoher.model.BasicCarRus;

public class CarAdapter implements BasicCar {

    private BasicCarRus basicCarRus;

    public CarAdapter(BasicCarRus basicCarRus) {
        this.basicCarRus = basicCarRus;
    }

    @Override
    public void drive() {
        basicCarRus.drive();
    }

    @Override
    public void xenonOn() {
        basicCarRus.basicLightOn();
    }

    @Override
    public void xenonOff() {
        basicCarRus.basicLightOff();
    }
}
