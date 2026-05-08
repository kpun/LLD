package com.Design.Patterns.Observer;

public interface Observable {

    void addObserver(Observer observer);

    void removeObserve(Observer observer);

    void notifyObservers();

    int getState();

    void setState(int state);
}
