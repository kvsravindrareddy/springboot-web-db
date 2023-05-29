package com.veera.controller;

import com.veera.data.ProductRequest;
import com.veera.data.ProductResponse;
import com.veera.service.ProductService;
import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProductController {

    @Autowired
    private ProductService productService;

    @PostMapping(value = "/product")
    public ProductResponse createProduct(@RequestBody ProductRequest request) {
        return productService.createProduct(request);
    }

    @GetMapping(value = "/product")
    public ProductResponse getProduct(@RequestParam("id")long id) {
        return productService.getProduct(id);
    }

    @GetMapping(value = "/productpath/{id}")
    public ProductResponse getProductByPathVar(@PathVariable("id")long id) {
        return productService.getProduct(id);
    }
}