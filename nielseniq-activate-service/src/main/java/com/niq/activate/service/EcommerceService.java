package com.niq.activate.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.niq.activate.entity.ShopperProductList;
import com.niq.activate.repository.ShopperProductListRepository;

@Service
public class EcommerceService {

	@Autowired
	private ShopperProductListRepository shopperProductListRepository;

	public List<ShopperProductList> getProductsByShopper(String shopperId, int limit) {
		List<ShopperProductList> productList = shopperProductListRepository.findByShopperId(shopperId);
		return productList.subList(0, Math.min(limit, productList.size()));
	}

}
