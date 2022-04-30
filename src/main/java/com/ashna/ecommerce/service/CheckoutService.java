package com.ashna.ecommerce.service;

import com.ashna.ecommerce.dto.Purchase;
import com.ashna.ecommerce.dto.PurchaseResponse;

public interface CheckoutService {
    PurchaseResponse placeOrder(Purchase purchase);
}
