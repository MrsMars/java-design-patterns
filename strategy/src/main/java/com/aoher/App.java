package com.aoher;

import com.aoher.model.AudiA3;
import com.aoher.model.AudiA4;
import com.aoher.model.RearWheelDrive;
import com.aoher.model.abstracts.AudiCar;

public class App {
    public static void main(String[] args) {
        AudiA3 audiA3 = new AudiA3();
        audiA3.performDrive();

        AudiA4 audiA4 = new AudiA4();
        audiA4.performDrive();

        AudiCar audiCar4 = new AudiA4();
        audiCar4.performDrive();
        audiCar4.setDrivable(new RearWheelDrive());
        audiCar4.performDrive();
    }
}
