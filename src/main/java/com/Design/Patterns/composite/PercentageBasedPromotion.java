package com.Design.Patterns.composite;

public class PercentageBasedPromotion implements Promotion {
    Double percentage;
    @Override
    public Double applyPromotion(Product product) {
        return product.getAmount()*percentage;
    }
}
