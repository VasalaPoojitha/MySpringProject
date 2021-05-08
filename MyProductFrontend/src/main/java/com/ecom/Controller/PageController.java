package com.ecom.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller

public class PageController {
	@RequestMapping("/Login")
	public String showLoginPage() {
		System.out.println("--------->Login page created<----------");
		return "Login";
	}
	
	@RequestMapping("/SignUp")
	public String showSignUpPage() {
		System.out.println("--------->SignUp page created<---------");
		return "SignUp";
	}
	@RequestMapping("/Home")
	public String showHomePage() {
		System.out.println("--------->Home page created<---------");
		return "Home";
	}
	

}
