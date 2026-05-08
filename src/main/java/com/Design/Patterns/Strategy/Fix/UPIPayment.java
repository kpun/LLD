package com.Design.Patterns.Strategy.Fix;

public class UPIPayment implements PaymentStrategy{
    @Override
    public void pay() {
        System.out.println("Payment done via UPI");
    }
}
