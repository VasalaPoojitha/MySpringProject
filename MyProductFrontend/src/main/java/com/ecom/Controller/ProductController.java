package com.ecom.Controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.ecom.Entity.Product;
import com.ecom.Entity.UserDetail;
import com.ecom.dao.ProductDAO;



@Controller
public class ProductController {
	@Autowired
	ProductDAO productDAO;
	
	@RequestMapping("/Product")
	public String showProductPage(Model m)
	{
		List<Product> productList=productDAO.getCategories();
		m.addAttribute("productList",productList);
		return "Product";
	}
@RequestMapping(value="/insertProduct",method=RequestMethod.POST)
public String insertProduct(@RequestParam("proId")int proId,@RequestParam("proName")String proName,@RequestParam("proDesc")String proDesc,Model m)
{
	System.out.println("Productid :"+proId);
	System.out.println("Product Name :"+proName);
	System.out.println("Product Desc :"+proDesc);
	
	Product product=new Product();
	product.setProductId(proId);
	product.setProductName(proName);
	product.setProductDesc(proDesc);
	
	productDAO.addProduct(product);
	
	System.out.println("------>Product Object Added<-------");
	List<Product> productList=productDAO.getCategories();
	m.addAttribute("productList",productList);
	return "Product";
}

@RequestMapping("/deleteProduct/{productId}")
public String deleteProduct(@PathVariable("productId")int productId,Model m)
{
  Product product=productDAO.getProduct(productId);
  productDAO.deleteProduct(product);
  
  List <Product> productList=productDAO.getCategories();
  m.addAttribute("productList", productList);
	
  return "Product";
  
}

@RequestMapping("/editProduct/{productId}")
public String editProduct(@PathVariable("productId")int productId,Model m)
{
  Product product=productDAO.getProduct(productId);
  m.addAttribute("product", product);
	
  return "UpdateProduct";  
 }

@RequestMapping(value="/updateProduct",method=RequestMethod.POST)
public String updateProduct(@RequestParam("proId")int proId,@RequestParam("proName")String proName,@RequestParam("proDesc")String proDesc,Model m)
{
	System.out.println("Productid :"+proId);
	System.out.println("Product Name :"+proName);
	System.out.println("Product Desc :"+proDesc);
	
	Product product=productDAO.getProduct(proId);
	product.setProductName(proName);
	product.setProductDesc(proDesc);
	
	productDAO.updateProduct(product);
	
	List<Product> productList=productDAO.getCategories();
	m.addAttribute("productList",productList);
	
	
	return "Product";
}

}