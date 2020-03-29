package com.aoher.model.factory.impl;

import com.aoher.model.LuxCar;
import com.aoher.model.Car;
import com.aoher.model.factory.CarFactory;

public class LuxCarFactory implements CarFactory {

    @Override
    public Car createCar() {
        return new LuxCar();
    }
}
