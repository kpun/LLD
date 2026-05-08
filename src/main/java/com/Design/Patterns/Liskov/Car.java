package com.Design.Patterns.Liskov;

public class Car extends Vehicle{
    @Override
    void startEngine() {
        System.out.println("Car is started");
    }
}
