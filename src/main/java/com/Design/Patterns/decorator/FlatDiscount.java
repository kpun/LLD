package com.Design.Patterns.decorator;

public class FlatDiscount extends BaseDecorator{
    public FlatDiscount(PriceCalculator priceCalculator) {
        super(priceCalculator);
    }

    @Override
    public Double calculatePrice(Product product) {

        Double amount = super.calculatePrice(product);

        System.out.println("flat discount applied" + amount*0.9);

        return amount*0.9;
    }
}
