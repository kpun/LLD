package com.Design.Patterns.Liskov.Fix;

public class Bicycle extends Manual{
    @Override
    void move() {
        System.out.println("Bicycle moved");
    }
}
