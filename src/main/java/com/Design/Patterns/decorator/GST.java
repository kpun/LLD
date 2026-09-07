package com.Design.Patterns.decorator;

public class GST extends BaseDecorator{
    public GST(PriceCalculator priceCalculator) {
        super(priceCalculator);
    }

    @Override
    public Double calculatePrice(Product product) {

        Double amount = super.calculatePrice(product);


        return amount*0.18 + amount;
    }
}
