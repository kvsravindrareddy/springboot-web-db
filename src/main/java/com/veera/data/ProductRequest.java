package com.veera.data;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

@Setter
@Getter
@Builder
public class ProductRequest implements Serializable  {
    private String name;
    private String description;
    private String price;
}