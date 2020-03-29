package com.aoher.model.abstracts;

public interface Notifier {
    void addObserver(Observer observer);
    void removeObserver(Observer observer);
    void notifyObserver();
}
