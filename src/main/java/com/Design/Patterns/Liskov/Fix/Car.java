package com.Design.Patterns.Liskov.Fix;

public class Car extends Motorized{
    @Override
    void startEngine() {
        System.out.println("Car started");
    }
}
