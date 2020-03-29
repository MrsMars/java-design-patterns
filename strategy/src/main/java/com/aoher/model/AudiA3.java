package com.aoher.model;

import com.aoher.model.abstracts.AudiCar;

public class AudiA3 extends AudiCar {

    public AudiA3() {
        setDrivable(new RearWheelDrive());
    }
}
