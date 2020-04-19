package com.capg.dao;

import java.util.List;

import com.capg.entities.Product;

public interface IProductDao {
	Product addProduct(Product product);
	Product fetchById(int id);
	Product updateProduct(Product product);
	List<Product> fetchAllProducts();
	boolean delete(int id);
}
