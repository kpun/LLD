package com.Design.Patterns.Strategy.VehicleExample.Fix;

public class NormalDriveStrategy implements DriveStrategy{

    @Override
    public void drive() {
        System.out.println("Normal Drive Strategy");
    }
}
