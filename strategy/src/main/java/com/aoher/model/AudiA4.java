package com.aoher.model;

import com.aoher.model.abstracts.AudiCar;

public class AudiA4 extends AudiCar {

    public AudiA4() {
        setDrivable(new FullWheelDrive());
    }
}
