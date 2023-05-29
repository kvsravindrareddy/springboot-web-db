package com.veera.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "CART_TB")
@Setter
@Getter
public class Cart {
    @Id
    private long id;
    private String name;
}