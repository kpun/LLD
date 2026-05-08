package com.Design.Patterns.Strategy.Fix;

public class UPIOrder extends Order{
    public UPIOrder() {
        super(2, new UPIPayment());
    }
}
