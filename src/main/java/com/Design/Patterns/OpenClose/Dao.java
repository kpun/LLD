package com.Design.Patterns.OpenClose;

import com.Design.Patterns.common.Invoice;

public interface Dao {

    public void save(Invoice invoice);
}
