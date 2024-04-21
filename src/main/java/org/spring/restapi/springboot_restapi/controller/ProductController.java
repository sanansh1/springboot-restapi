package org.spring.restapi.springboot_restapi.controller;

import org.spring.restapi.springboot_restapi.entity.Product;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@RestController
public class ProductController {
    @PostMapping("/product")
    public ResponseEntity createProduct(@RequestBody final Product product){
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

    @GetMapping("/product/{id}")
    public Product getProduct(@PathVariable final String id){
        return new Product(id, "Single Product",new BigDecimal("100.45"));
    }

    @PatchMapping
    public void patchProduct(@RequestBody final Product product){
        System.out.println(product);
    }

    @DeleteMapping
    public void deleteProduct(@RequestBody final Product product){
        System.out.println(product);
    }

}
