package com.aoher.model;

import com.aoher.util.GPSNotifier;
import com.aoher.util.GPSPower;
import com.aoher.util.RoadAdvisor;

public class GPSInterface {

    private GPSPower power;
    private GPSNotifier notifier;
    private RoadAdvisor roadAdvisor;

    public GPSInterface(GPSPower power, GPSNotifier notifier, RoadAdvisor roadAdvisor) {
        this.power = power;
        this.notifier = notifier;
        this.roadAdvisor = roadAdvisor;
    }

    public void activate() {
        power.powerOn();
        notifier.downloadRoadInfo();
        roadAdvisor.route();
    }

    public void deactivate() {
        power.powerOff();
    }
}
