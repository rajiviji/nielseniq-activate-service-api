package com.niq.activate.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.niq.activate.entity.ShopperProductList;

import java.util.List;

@Repository
public interface ShopperProductListRepository extends JpaRepository<ShopperProductList, String> {
	List<ShopperProductList> findByShopperId(String shopperId);
}
