package com.Design.Patterns.Strategy.VehicleExample.Fix;

public class RoughDriveStrategy implements DriveStrategy{

    @Override
    public void drive() {
        System.out.println("Rough Drive Strategy");
    }
}
