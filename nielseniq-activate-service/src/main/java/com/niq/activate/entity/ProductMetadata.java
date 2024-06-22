package com.niq.activate.entity;


import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class ProductMetadata {

    @Id
    private String productId;
    private String category;
    private String brand;

   

    public ProductMetadata() {
    }

    public ProductMetadata(String productId, String category, String brand) {
        this.productId = productId;
        this.category = category;
        this.brand = brand;
    }

    // Getters and setters
    public String getProductId() {
        return productId;
    }

    public void setProductId(String productId) {
        this.productId = productId;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }
}
