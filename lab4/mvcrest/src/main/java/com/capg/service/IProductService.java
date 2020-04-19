package com.capg.service;

import java.util.List;

import com.capg.entities.Product;

public interface IProductService {

	Product addProduct(Product product);
	Product fetchById(int id);
	Product updateProduct(Product product);
	List<Product> fetchAllProducts();
	boolean delete(int id);
}
