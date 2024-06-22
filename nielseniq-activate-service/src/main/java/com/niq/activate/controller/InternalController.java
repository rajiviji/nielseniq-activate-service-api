package com.niq.activate.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.niq.activate.entity.ProductMetadata;
import com.niq.activate.entity.ShopperProductList;
import com.niq.activate.service.InternalService;

@RestController
@RequestMapping("/internal")
public class InternalController {
	
	@Autowired
	private InternalService internalService;
	

    @PostMapping("/shopper")
    public ResponseEntity<String> saveShopperProductList(@RequestBody ShopperProductList shopperProductList) {
    	internalService.saveShopperProduct(shopperProductList);
        return ResponseEntity.ok("Shopper product list saved");
    }

    @PostMapping("/product")
    public ResponseEntity<String> saveProductMetadata(@RequestBody ProductMetadata productMetadata) {
    	internalService.saveProductMetaData(productMetadata);
        return ResponseEntity.ok("Product metadata saved");
    }
    
    

    @GetMapping("/health")
    public String healthCheck() {
        return "UP";
    }
}
