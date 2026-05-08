package com.Design.Patterns.InterfaceSegregation;

public class Rectangle implements Shape{
    @Override
    public void calculateArea() {

    }

    @Override
    public void calculateVolume() {
        //big fat interface violation of ISP.
        System.out.println("I don't have volume");
    }
}
