package com.Design.Patterns.Observer;

import java.util.ArrayList;
import java.util.List;

public class ObservableImpl implements Observable{
    List<Observer> observerList;
    int state;

    public ObservableImpl(int state) {
        this.state = state;
        observerList = new ArrayList<>();
    }

    @Override
    public void addObserver(Observer observer) {
        observerList.add(observer);
    }

    @Override
    public void removeObserve(Observer observer) {
        observerList.remove(observer);

    }

    @Override
    public void notifyObservers() {
        for(Observer observer: observerList) {
            observer.update();
        }
    }

    @Override
    public void setState(int state) {
        this.state = state;
        notifyObservers();
    }

    @Override
    public int getState() {
        return this.state;
    }
}
