package com.aoher;

import com.aoher.model.GPSInterface;
import com.aoher.util.GPSNotifier;
import com.aoher.util.GPSPower;
import com.aoher.util.RoadAdvisor;

public class App {

    public static void main(String[] args) {
        GPSPower power = new GPSPower();
        GPSNotifier notifier = new GPSNotifier();
        RoadAdvisor roadAdvisor = new RoadAdvisor();

        power.powerOn();
        notifier.downloadRoadInfo();
        roadAdvisor.route();
        power.powerOff();

        System.out.println("--- or ---");

        GPSInterface gps = new GPSInterface(power, notifier, roadAdvisor);
        gps.activate();
        gps.deactivate();
    }
}
