package com.ecom.config;

import java.util.Properties;

import javax.sql.DataSource;

import org.hibernate.SessionFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.orm.hibernate5.HibernateTransactionManager;
import org.springframework.orm.hibernate5.LocalSessionFactoryBuilder;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import com.ecom.Entity.Product;

@Configuration
@EnableTransactionManagement
@ComponentScan("com.ecom")
public class DBConfig 
{
	@Bean(name = "dataSource")
	public DataSource getMySqlDataSource() 
	{
		DriverManagerDataSource DS = new DriverManagerDataSource();
		DS.setDriverClassName("com.mysql.cj.jdbc.Driver");
		DS.setUrl("jdbc:mysql://localhost/springprj");
		DS.setUsername("root");
		DS.setPassword("poojitha@26");
		System.out.println("---------->DataSource Created<---------");
		return DS;
	}
	
	@Bean(name = "sessionFactory")
	public SessionFactory getSessionFactory()
	{
		Properties prop = new Properties();
		prop.put("hbm2dd1.auto" , "update");
		prop.put("hibernate.dialect", "org.hibernate.dialect.MySQL8Dialect");
		
		LocalSessionFactoryBuilder factoryBuilder = new LocalSessionFactoryBuilder(getMySqlDataSource());
		factoryBuilder.addProperties(prop);
		

		factoryBuilder.addAnnotatedClass(Product.class);
		
		SessionFactory sessionFactory = factoryBuilder.buildSessionFactory();
		System.out.println("----------->Session Factory Created<-------------");
		return sessionFactory;
		
	}
	
	@Bean(name ="transactManager")
	public HibernateTransactionManager getHibernateTransaction(SessionFactory sessionfactory)
	{
		System.out.println("------------->Transaction Created<-----------");
		return new HibernateTransactionManager(sessionfactory);
	}
}
