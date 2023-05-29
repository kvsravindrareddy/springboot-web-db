package com.veera.controller;

import com.veera.service.ProductCartService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProductCartController {

    @Autowired
    private ProductCartService productCartService;

    @PostMapping("/productcart")
    public String productAndCart() {
        productCartService.createProductCart();
        return "Success";
    }
}