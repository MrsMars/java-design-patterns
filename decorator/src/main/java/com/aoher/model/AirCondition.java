package com.aoher.model;

import com.aoher.model.abstracts.Car;
import com.aoher.model.abstracts.Decorator;

public class AirCondition extends Decorator {

    private Car car;

    public AirCondition(Car car) {
        this.car = car;
    }

    @Override
    public String getInfo() {
        return car.getInfo() + " + Air Conditioning";
    }

    @Override
    public int getPrice() {
        return car.getPrice() + 1000;
    }
}
