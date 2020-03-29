package com.aoher.model;

import com.aoher.model.abstracts.Notifier;
import com.aoher.model.abstracts.Observer;

public class Dashboard implements Observer {

    private int speed;
    private int rpm;
    private int oilPressure;

    public Dashboard(Notifier notifier) {
        notifier.addObserver(this);
    }

    @Override
    public void update(int speed, int rpm, int oilPressure) {
        this.speed = speed;
        this.rpm = rpm;
        this.oilPressure = oilPressure;
        show();
    }

    public void show() {
        System.out.println("Speed = " + speed + ", RPM = " + rpm +
                ", Oil pressure = " + oilPressure);
    }
}
