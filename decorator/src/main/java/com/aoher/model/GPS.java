package com.aoher.model;

import com.aoher.model.abstracts.Car;
import com.aoher.model.abstracts.Decorator;

public class GPS extends Decorator {

    private Car car;

    public GPS(Car car) {
        this.car = car;
    }

    @Override
    public String getInfo() {
        return car.getInfo() + " + GPS";
    }

    @Override
    public int getPrice() {
        return car.getPrice() + 1500;
    }
}
