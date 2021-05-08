package com.ecom.dao;

import java.util.List;

import com.ecom.Entity.Product;

public interface ProductDAO 
{
	public boolean addProduct(Product product);
	public boolean deleteProduct(Product product);
	public boolean updateProduct(Product product);
	public List<Product> getCategories();
	public Product getProduct(int productId);
}

