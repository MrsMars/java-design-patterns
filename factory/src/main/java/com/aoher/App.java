package com.aoher;

import com.aoher.model.Car;
import com.aoher.model.factory.CarFactory;
import com.aoher.model.factory.impl.BasicCarFactory;
import com.aoher.model.factory.impl.LuxCarFactory;

public class App {

    public static void main(String[] args) {
        CarFactory myLuxFactory = new LuxCarFactory();
        CarFactory myBasicFactory = new BasicCarFactory();

        Car myLuxCar = myLuxFactory.createCar();
        Car myBasicCar = myBasicFactory.createCar();

        System.out.println(myLuxCar);
        System.out.println(myBasicCar);
    }
}
