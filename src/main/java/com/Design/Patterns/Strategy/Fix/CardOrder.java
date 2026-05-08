package com.Design.Patterns.Strategy.Fix;

public class CardOrder extends Order{
    public CardOrder() {
        super(1, new CardPayment());
    }
}
