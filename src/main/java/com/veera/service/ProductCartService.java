package com.veera.service;

import com.veera.entity.Cart;
import com.veera.entity.Product;
import com.veera.exception.BusinessException;
import com.veera.repo.CartRepo;
import com.veera.repo.ProductRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.TransactionStatus;
import org.springframework.transaction.support.TransactionCallbackWithoutResult;
import org.springframework.transaction.support.TransactionTemplate;

@Service
public class ProductCartService {
    @Autowired
    private TransactionTemplate transactionTemplate;

    @Autowired
    private ProductService productService;
    @Autowired
    private CartService cartService;
    public void createProductCart() {
        try {
            transactionTemplate.execute(new TransactionCallbackWithoutResult() {
                @Override
                protected void doInTransactionWithoutResult(TransactionStatus status) {
                    boolean flag = false;
                    productService.save();
                    if (!flag) {
                        System.out.println(1 / 0);
                        cartService.save();
                    }
                }
            });
        }catch (Exception e) {
            e.printStackTrace();;
            throw new BusinessException("Exception occurred while processing the request");
        }
    }
}