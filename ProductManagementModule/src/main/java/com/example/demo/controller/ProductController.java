package com.example.demo.controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.demo.model.Product;
import com.example.demo.service.ProductService;

@Controller
public class ProductController {
	ProductService productService;
	
	public ProductController(ProductService productService) {
		this.productService = productService;
	} 
	
	@RequestMapping("/products")
	public String productsMapper(Model model){
		List<Product> productsList = productService.fetchProducts();
		model.addAttribute("products",productsList);
		return "products";
		
	}
	
}
