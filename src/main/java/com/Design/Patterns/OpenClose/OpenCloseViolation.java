package com.Design.Patterns.OpenClose;

import com.Design.Patterns.common.Invoice;

public class OpenCloseViolation {
    private Invoice invoice;

    public OpenCloseViolation(Invoice invoice) {
        this.invoice = invoice;
    }

    public void saveToDb() {

    }

    //Now this has violated open close principle we are modifying existing class instead of extending it.
    public void saveToFile() {

    }
}
