package com.veera.service;

import com.google.gson.Gson;
import com.veera.data.ProductRequest;
import com.veera.data.ProductResponse;
import com.veera.entity.Product;
import com.veera.repo.CartRepo;
import com.veera.repo.ProductRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class ProductService {

    @Autowired
    private ProductRepo productRepo;

    @Autowired
    private CartRepo cartRepo;

    private Gson gson = new Gson();

    //GSON
    //ObjectMapper
    //Mapstruct
    public ProductResponse createProduct(ProductRequest request) {
        Product product = new Product();
        product.setName(request.getName());
        product.setDes(request.getDescription());
        product.setPrice(request.getPrice());
        Product responseEntity = productRepo.save(product);
        return ProductResponse.builder().name(responseEntity.getName())
                .description(responseEntity.getDes())
                .price(responseEntity.getPrice()).build();
    }

    public ProductResponse getProduct(long id) {
        Optional<Product> productOptional = productRepo.findById(id);
        ProductResponse productResponse = null;
        if(productOptional.isPresent()) {
            Product product = productOptional.get();
            String prdJson = gson.toJson(product);
            System.out.println("prdJson : "+prdJson);
//            return gson.fromJson(prdJson, ProductResponse.class);
            productResponse = ProductResponse.builder().name(product.getName())
                    .description(product.getDes())
                    .price(product.getPrice())
                    .build();
        }
        return productResponse;
    }

    public void save() {
        Product product = new Product();
        product.setName("name2");
        product.setPrice("10");
        product.setDes("desc2");
        productRepo.save(product);
    }
}