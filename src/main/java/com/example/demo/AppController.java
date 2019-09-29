package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class AppController {
	@RequestMapping("/index")
	public String home() {
		return "index";
		
	}
	
	@RequestMapping("/account")
	public String account() {
		return "account";
		
	}
	
	@RequestMapping("/checkout")
	public String checkout() {
		return "checkout";
		
	}
	
	@RequestMapping("/contact")
	public String contact() {
		return "contact";
		
	}
	
	@RequestMapping("/products")
	public String product() {
		return "products";
		
	}
	
	@RequestMapping("/single")
	public String single() {
		return "single";
		
	}
	
	@RequestMapping("/wishlist")
	public String wishlist() {
		return "wishlist";
		
	}


}
