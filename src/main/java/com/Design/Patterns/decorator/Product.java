package com.Design.Patterns.decorator;


public class Product {
    Double amount;

    public Product(Double amount) {
        this.amount = amount;
    }

    public Double getAmount() {
        return this.amount;
    }
}
