package com.Design.Patterns.InterfaceSegregation;

public class Cube implements Shape{
    @Override
    public void calculateArea() {
       System.out.println("Calculating Area");
    }

    @Override
    public void calculateVolume() {
       System.out.println("Calculating Volume");
    }
}
