package com.Design.Patterns.Liskov.Fix;

import com.Design.Patterns.Liskov.Vehicle;

public class Motorized extends Vehicle {

    void startEngine() {
        System.out.println("Engine is started");
    }
}
