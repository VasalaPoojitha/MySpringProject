package com.ecom.test;

import static org.junit.Assert.assertTrue;

import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.ecom.dao.ProductDAO;
import com.ecom.Entity.Product;

public class ProductDAOTest {

	static ProductDAO productDAO;
	@BeforeClass
	public static void initialize()
	{
		AnnotationConfigApplicationContext context=new AnnotationConfigApplicationContext();
		context.scan("com.ecom");
		context.refresh();
		
		productDAO=(ProductDAO)context.getBean("productDAO");
		
	}
	
	@Test
	public void addProductTest()
	{
		Product product=new Product();
		product.setProductId(1001);
		product.setProductName("Acer");
		product.setProductDesc("All windows 10 Graphics are powered by Intel HD Graphics 620.");
		assertTrue("Problem Occured while Adding Product:",productDAO.addProduct(product));
		
	}
	@Ignore
	@Test
	public void updateProductTest()
	{
		Product product=productDAO.getProduct(1003);
		product.setProductName("HP");
		product.setProductDesc("All windows 10 of Lenovo available.");
		assertTrue("Problem Occured while updating Product:",productDAO.updateProduct(product));
		
	}

}
