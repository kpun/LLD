package com.Design.Patterns.Strategy.VehicleExample.Fix;

public class Car extends Vehicle{
    public Car() {
        super(new NormalDriveStrategy());
    }
}
