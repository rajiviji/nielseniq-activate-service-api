package com.niq.activate.entity;

import java.io.Serializable;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class ShopperProductListId implements Serializable {
    private String shopperId;
    private String productId;

}
