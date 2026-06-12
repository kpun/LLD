package com.Design.Patterns.decorator;

public class BasePriceCalculator implements PriceCalculator {

    @Override
    public Double calculatePrice(Product product) {
        return product.getAmount();
    }
}
