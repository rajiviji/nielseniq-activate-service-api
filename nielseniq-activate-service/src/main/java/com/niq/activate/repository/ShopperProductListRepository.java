package com.niq.activate.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.niq.activate.entity.ShopperProductList;
import com.niq.activate.entity.ShopperProductListId;

import java.util.List;

public interface ShopperProductListRepository extends JpaRepository<ShopperProductList, ShopperProductListId> {
    List<ShopperProductList> findByShopperId(String shopperId);
}
