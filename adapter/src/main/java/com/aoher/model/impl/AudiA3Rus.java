package com.aoher.model.impl;

import com.aoher.model.BasicCarRus;

public class AudiA3Rus implements BasicCarRus {
    public static final int LIGHT = 50;

    @Override
    public void drive(){
        System.out.println("AudiA3Rus rides!");
    }

    @Override
    public void basicLightOn(){
        System.out.println("AudiA3Rus basic light on");
    }

    @Override
    public void basicLightOff(){
        System.out.println("AudiA3Rus basic light off");
    }
}
