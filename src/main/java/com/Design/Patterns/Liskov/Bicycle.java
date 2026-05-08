package com.Design.Patterns.Liskov;

public class Bicycle extends Vehicle{
    @Override
    void startEngine() {
        try {
            throw new Exception("Bicycle does not have engine");
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
