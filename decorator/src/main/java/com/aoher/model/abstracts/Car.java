package com.aoher.model.abstracts;

public abstract class Car {

    String name = "Unnamed Car";

    public Car() {
    }

    public Car(String name) {
        this.name = name;
    }

    public String getInfo() {
        return name;
    }

    public abstract int getPrice();
}
