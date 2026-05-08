package com.Design.Patterns.Strategy.Fix;

public class Order {
    int orderId;
    public PaymentStrategy paymentStrategy; // different paymentStrategy can be injected

    public Order(int orderId, PaymentStrategy paymentStrategy) {
        this.orderId = orderId;
        this.paymentStrategy = paymentStrategy;
    }

    public void pay() {
        paymentStrategy.pay();
    }
}
