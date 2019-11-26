package com.ecommerce.microecommerce.web.controller;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.ecommerce.microecommerce.model.Product;

@RestController
public class ProductController {
	@RequestMapping(value="/produits", method=RequestMethod.GET)
	public String listeProduits() {
		return "exemple produits";
	}
	
	@RequestMapping(value="/produit/{id}", method=RequestMethod.GET)
	public Product unProduit(@PathVariable int id) {
		Product product = new Product(id, new String("aspirator"), 100);
		
		return product;
	}
}
