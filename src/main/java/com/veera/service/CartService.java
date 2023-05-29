package com.veera.service;

import com.veera.entity.Cart;
import com.veera.repo.CartRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CartService {
    @Autowired
    private CartRepo cartRepo;

    public void save() {
        Cart cart = new Cart();
        cart.setName("cart2");
        cartRepo.save(cart);
    }
}