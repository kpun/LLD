package com.Design.Patterns.Strategy.Fix;

public class CardPayment implements PaymentStrategy{
    @Override
    public void pay() {
        System.out.println("Payment done via Card");
    }
}
