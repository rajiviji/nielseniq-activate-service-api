package com.niq.activate.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.niq.activate.entity.ProductMetadata;
import com.niq.activate.entity.ShopperProductList;
import com.niq.activate.repository.ProductMetadataRepository;
import com.niq.activate.repository.ShopperProductListRepository;

@Service
public class InternalService {
    @Autowired
    private ShopperProductListRepository shopperProductListRepository;

    @Autowired
    private ProductMetadataRepository productMetadataRepository;



	public ShopperProductList saveShopperProduct(ShopperProductList shopperProductList) {
		return shopperProductListRepository.save(shopperProductList);
		
	}

	public ProductMetadata saveProductMetaData(ProductMetadata productMetadata) {
		  return productMetadataRepository.save(productMetadata);
		
	}
}
