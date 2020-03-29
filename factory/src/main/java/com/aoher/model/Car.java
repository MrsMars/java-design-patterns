package com.aoher.model;

import java.util.ArrayList;
import java.util.List;

public abstract class Car {

    String name;
    List<String> accessories = new ArrayList<>();

    @Override
    public String toString() {
        return String.format("Model car: %s%n%s", name, accessories);
    }
}
