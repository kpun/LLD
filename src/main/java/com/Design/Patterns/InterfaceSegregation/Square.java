package com.Design.Patterns.InterfaceSegregation;

public class Square implements Shape{
    @Override
    public void calculateArea() {
        System.out.println("Calculating Area for square");
    }

    @Override
    public void calculateVolume() {
        System.out.println("I don't have volume why i need to implement");
        //throw exception
    }
}
