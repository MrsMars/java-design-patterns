package com.aoher.model;

public class PresidentCar {

    private static PresidentCar presidentCar;
    private int armor;

    private PresidentCar() {
        this.armor = 120;
    }

    public int getArmor() {
        return armor;
    }

    public void setArmor(int armor) {
        this.armor = armor;
    }

    public static PresidentCar getInstance() {
        PresidentCar localPresidentCar = presidentCar;
        if (localPresidentCar == null) {
            synchronized (PresidentCar.class) {
                localPresidentCar = presidentCar;
                if (localPresidentCar == null) {
                    presidentCar = localPresidentCar = new PresidentCar();
                }
            }
        }
        return localPresidentCar;
    }
}
