package com.Design.Patterns.composite;

import java.util.List;

public class Composite implements Promotion{
    List<Promotion> promotionList;

    public void addPromotion(Promotion promotion) {
        promotionList.add(promotion);
    }
    @Override
    public Double applyPromotion(Product product) {
        Double amount = 0.0;
        for(Promotion promotion: promotionList) {
            amount+=promotion.applyPromotion(product);
        }
        return amount;
    }
}
