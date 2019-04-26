package com.itgenius.dao;

import java.util.List;

import com.itgenius.model.Products;

public interface ProductsDAO {
	void save(Products products);

	Products get(int id);

	void delete(int id);

	List<Products> get();
}
