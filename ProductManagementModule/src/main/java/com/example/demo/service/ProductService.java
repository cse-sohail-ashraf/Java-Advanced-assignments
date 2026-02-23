package com.example.demo.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.demo.dao.ProductDao;
import com.example.demo.model.Product;

@Service
public class ProductService {
	ProductDao productDao;
	
	public ProductService(ProductDao productDao) {
		this.productDao = productDao;
	}
	
	public List<Product> fetchProducts(){
		return productDao.getAllProducts();
	}
}
