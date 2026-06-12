package com.Design.Patterns.composite;

import com.Design.Patterns.decorator.Product;

public class FlatPromotion implements Promotion{
    @Override
    public Double applyPromotion(Product product) {
        return product.getAmount()*0.9;
    }
}
