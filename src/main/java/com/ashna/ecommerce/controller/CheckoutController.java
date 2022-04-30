package com.ashna.ecommerce.controller;

import com.ashna.ecommerce.dto.Purchase;
import com.ashna.ecommerce.dto.PurchaseResponse;
import com.ashna.ecommerce.service.CheckoutService;
import org.springframework.web.bind.annotation.*;

@CrossOrigin("http://localhost:4200")
@RestController
@RequestMapping("/api/checkout")
public class CheckoutController {
    private CheckoutService checkoutService;

    public CheckoutController(CheckoutService checkoutService){
        this.checkoutService = checkoutService;
    }

    @PostMapping("/purchae")
    public PurchaseResponse placeOrder(@RequestBody Purchase purchase){
        PurchaseResponse purchaseResponse = checkoutService.placeOrder(purchase);
        return purchaseResponse;
     }
}
