package com.niq.activate.entity;


import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.Data;

@Entity
@Data
public class ProductMetadata {
    @Id
    private String productId;
    private String category;
    private String brand;

}

