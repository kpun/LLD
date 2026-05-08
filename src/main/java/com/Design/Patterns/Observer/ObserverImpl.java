package com.Design.Patterns.Observer;

public class ObserverImpl implements Observer{
    Observable observable;

    public ObserverImpl(Observable observable) {
        this.observable = observable;
    }

    @Override
    public void update() {
        System.out.println(observable.getState());
    }
}
