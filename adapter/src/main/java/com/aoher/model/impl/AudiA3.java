package com.aoher.model.impl;

import com.aoher.model.BasicCar;

public class AudiA3 implements BasicCar {

    public static final int LIGHT = 100;

    @Override
    public void drive(){
        System.out.println("AudiA3 rides!");
    }

    @Override
    public void xenonOn(){
        System.out.println("AudiA3 xenon on ");
    }

    @Override
    public void xenonOff(){
        System.out.println("AudiA3 xenon off");
    }
}
