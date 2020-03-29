package com.aoher.model;

import com.aoher.model.abstracts.Car;

public class AudiA4 extends Car {

    public AudiA4() {
        super("Audi A4");
    }

    @Override
    public int getPrice() {
        return 15_000;
    }
}
