package com.Design.Patterns.Strategy.VehicleExample.Fix;

public class Vehicle {
    DriveStrategy driveStrategy;
    public Vehicle(DriveStrategy driveStrategy) {
        this.driveStrategy = driveStrategy;
    }
}
