package com.niq.activate.entity;


import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;

@Entity
public class ShopperProductList {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "shopper_id")
    private String shopperId;

    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    @JoinColumn(name = "shopper_list_id") 
    private List<ProductMetadata> shelf;


    public ShopperProductList() {
    }

    public ShopperProductList(String shopperId, List<ProductMetadata> shelf) {
        this.shopperId = shopperId;
        this.shelf = shelf;
    }

    // Getters and setters

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getShopperId() {
        return shopperId;
    }

    public void setShopperId(String shopperId) {
        this.shopperId = shopperId;
    }

    public List<ProductMetadata> getShelf() {
        return shelf;
    }

    public void setShelf(List<ProductMetadata> shelf) {
        this.shelf = shelf;
    }
}
