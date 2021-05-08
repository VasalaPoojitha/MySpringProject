package com.ecom.dao;

import java.util.List;

import javax.transaction.Transactional;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;


import com.ecom.Entity.Product;



@Repository("productDAO")
@Transactional
public class ProductDAOimpl implements ProductDAO
{
	@Autowired
	SessionFactory sessionFactory;

	@Override
	public boolean addProduct(Product product) {
		// TODO Auto-generated method stub
		try
		{
			sessionFactory.getCurrentSession().save(product);
			return true;
		}catch (Exception e) {
			return false;
		}
	}
		

	@Override
	public boolean deleteProduct(Product product) {
		// TODO Auto-generated method stub
		try
		{
			sessionFactory.getCurrentSession().delete(product);
			return true;
		}catch (Exception e) {
		return false;
		}
	}

	@Override
	public boolean updateProduct(Product product) {
		// TODO Auto-generated method stub
		try
		{
			sessionFactory.getCurrentSession().update(product);
			return true;
		}catch (Exception e) {
		return false;
		}
	}

	@Override
	public List<Product> getCategories() {
		// TODO Auto-generated method stub
		Session session=sessionFactory.openSession();
		org.hibernate.query.Query query=session.createQuery("from Product");
		List<Product> productList=query.list();
		session.close();
		return productList;
		
	}

	@Override
	public Product getProduct(int productId) {
		// TODO Auto-generated method stub
		Session session=sessionFactory.openSession();
		Product product=(Product)session.get(Product.class, productId);
		session.close();
		return product;
	}
	
	
}

