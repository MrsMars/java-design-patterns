package com.aoher.model.factory.impl;

import com.aoher.model.BasicCar;
import com.aoher.model.Car;
import com.aoher.model.factory.CarFactory;

public class BasicCarFactory implements CarFactory {

    @Override
    public Car createCar() {
        return new BasicCar();
    }
}
