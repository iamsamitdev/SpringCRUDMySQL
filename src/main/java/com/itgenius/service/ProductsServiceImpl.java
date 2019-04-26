package com.itgenius.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.itgenius.dao.ProductsDAO;
import com.itgenius.model.Products;

@Service
public class ProductsServiceImpl implements ProductsService {

	@Autowired
	private ProductsDAO productsDAO;

	@Override
	@Transactional
	public void save(Products products) {
		// TODO Auto-generated method stub
		productsDAO.save(products);
	}

	@Override
	@Transactional
	public Products get(int id) {
		// TODO Auto-generated method stub
		return productsDAO.get(id);
	}

	@Override
	@Transactional
	public void delete(int id) {
		// TODO Auto-generated method stub
		productsDAO.delete(id);
	}

	@Override
	@Transactional
	public List<Products> get() {
		// TODO Auto-generated method stub
		return productsDAO.get();
	}

}
