package com.ecom.test;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class SampleTest 
{
	public static void main(String agrs[]) {
		
	AnnotationConfigApplicationContext context=new AnnotationConfigApplicationContext();
	
	context.scan("com.ecom");
	context.refresh();
	}
	
	

}
