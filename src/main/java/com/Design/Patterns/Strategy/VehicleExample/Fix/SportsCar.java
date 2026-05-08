package com.Design.Patterns.Strategy.VehicleExample.Fix;

public class SportsCar extends Vehicle{
    public SportsCar() {
        super(new RoughDriveStrategy());
    }
}
