package com.niq.activate.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.niq.activate.entity.ShopperProductList;
import com.niq.activate.service.EcommerceService;

import java.util.List;

@RestController
@RequestMapping("/external")
public class EcommerceController {
	@Autowired
	private EcommerceService ecommerService;

	@GetMapping("/products")
	public List<ShopperProductList> getProductsByShopper(@RequestParam String shopperId,
			@RequestParam(required = false) String category, @RequestParam(required = false) String brand,
			@RequestParam(defaultValue = "10") int limit) {

		return ecommerService.getProductsByShopper(shopperId, limit);

	}
}
