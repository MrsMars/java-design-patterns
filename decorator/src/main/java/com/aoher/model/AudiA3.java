package com.aoher.model;

import com.aoher.model.abstracts.Car;

public class AudiA3 extends Car {

    public AudiA3() {
        super("Audi A3");
    }

    @Override
    public int getPrice() {
        return 10_000;
    }
}
