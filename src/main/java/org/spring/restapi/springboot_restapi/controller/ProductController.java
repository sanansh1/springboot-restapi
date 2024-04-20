package org.spring.restapi.springboot_restapi.controller;

import org.spring.restapi.springboot_restapi.entity.Product;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@RestController
public class ProductController {
    @PostMapping("/product")
    public ResponseEntity createProduct(@RequestBody Product product){
        String result= UUID.randomUUID().toString();
        return ResponseEntity.status(HttpStatus.CREATED).contentType(MediaType.APPLICATION_JSON).body(result);
    }

    @GetMapping("/product")
    public List<Product> getProducts(){
        List<Product> productsList = new ArrayList<>();
        Product product = new Product(UUID.randomUUID().toString(), "Testing1", new BigDecimal(100.00));
        product.setId(UUID.randomUUID().toString());
        productsList.add(product);
        product = new Product(UUID.randomUUID().toString(), "Testing2", new BigDecimal(200.00));
        product.setId(UUID.randomUUID().toString());
        productsList.add(product);
        return productsList;
    }

}
