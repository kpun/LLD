package com.Design.Patterns.decorator;

public abstract class BaseDecorator implements PriceCalculator {
    public PriceCalculator priceCalculator;

    public BaseDecorator(PriceCalculator priceCalculator) {
        this.priceCalculator = priceCalculator;
    }

    @Override
    public Double calculatePrice(Product product) {
        return priceCalculator.calculatePrice(product);
    }
}
