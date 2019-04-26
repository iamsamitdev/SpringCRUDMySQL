package com.itgenius.service;

import java.util.List;

import com.itgenius.model.Products;

public interface ProductsService {
	void save(Products products);

	Products get(int id);

	void delete(int id);

	List<Products> get();
}
