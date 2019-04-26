package com.itgenius.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.itgenius.model.Products;

@Repository
public class ProductsDAOImpl implements ProductsDAO {

	@Autowired
	private SessionFactory sessionFactory;

	@Override
	public void save(Products products) {
		// TODO Auto-generated method stub
		sessionFactory.getCurrentSession().saveOrUpdate(products);
	}

	@Override
	public Products get(int id) {
		Products product = sessionFactory.getCurrentSession().get(Products.class, id);
		return product;
	}

	@Override
	public void delete(int id) {
		Session session = sessionFactory.getCurrentSession();
		Products product = session.get(Products.class, id);
		session.delete(product);

	}

	@Override
	public List<Products> get() {
		return sessionFactory.getCurrentSession().createQuery("from Products").list();
	}

}
