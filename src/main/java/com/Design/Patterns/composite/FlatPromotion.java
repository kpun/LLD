package com.Design.Patterns.composite;

public class FlatPromotion implements Promotion{
    @Override
    public Double applyPromotion(Product product) {
        return product.getAmount()*0.9;
    }
}
