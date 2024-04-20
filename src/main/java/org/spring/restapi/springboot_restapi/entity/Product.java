package org.spring.restapi.springboot_restapi.entity;

import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;
@Getter
@Setter
public class Product {
    private String id;
    private String name;
    private String description;
    private BigDecimal price;
    public Product(String id, String desc, BigDecimal price){
        this.id = id;
        this.description=desc;
        this.price=price;
    }
}
