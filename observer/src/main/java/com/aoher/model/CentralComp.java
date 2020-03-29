package com.aoher.model;

import com.aoher.model.abstracts.Notifier;
import com.aoher.model.abstracts.Observer;

import java.util.ArrayList;
import java.util.List;

public class CentralComp implements Notifier {

    private List<Observer> observers;

    private int speed;
    private int rpm;
    private int oilPressure;

    public CentralComp() {
        this.observers = new ArrayList<>();
    }

    public void changeData(int speed, int rpm, int oilPressure) {
        this.speed = speed;
        this.rpm = rpm;
        this.oilPressure = oilPressure;
        notifyObserver();
    }

    @Override
    public void addObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        int i = observers.indexOf(observer);
        if (i >= 0) {
            observers.remove(i);
        }
    }

    @Override
    public void notifyObserver() {
        observers.forEach(observer ->
                observer.update(speed, rpm, oilPressure));
    }
}
