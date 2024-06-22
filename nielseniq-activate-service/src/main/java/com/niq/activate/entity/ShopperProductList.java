package com.niq.activate.entity;


import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;

import lombok.Data;

@Entity
@Data
@IdClass(ShopperProductListId.class)
public class ShopperProductList {
    @Id
    private String shopperId;
    @Id
    private String productId;
    private double relevancyScore;

}
