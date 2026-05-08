package com.Design.Patterns.Strategy.VehicleExample.Fix;

public class OffRoadCar extends Vehicle{
    public OffRoadCar() {
        super(new RoughDriveStrategy());
    }
}
