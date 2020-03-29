package com.aoher;

import com.aoher.model.PresidentCar;

public class App {

    public static void main(String[] args) {
        PresidentCar prCar = PresidentCar.getInstance();
        System.out.println(prCar.getArmor());
        prCar.setArmor(250);

        PresidentCar prCar1 = PresidentCar.getInstance();
        System.out.println(prCar1.getArmor());
    }
}
