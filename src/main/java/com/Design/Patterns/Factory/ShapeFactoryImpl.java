package com.Design.Patterns.Factory;

public class ShapeFactoryImpl implements ShapeFactory{
    @Override
    public Shape getShape(String input) {
        if(input.equals("CIRCLE"))
            return new Circle();
        else if(input.equals("SQUARE"))
            return new Square();
        return null;
    }
}
