package com.Design.Patterns.composite;

import com.Design.Patterns.decorator.Product;

public class PercentageBasedPromotion implements Promotion {
    Double percentage;
    @Override
    public Double applyPromotion(Product product) {
        return product.getAmount()*percentage;
    }
}
