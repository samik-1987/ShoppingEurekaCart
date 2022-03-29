package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class ShoppingController {
	
	@Autowired
	public RestTemplate template;
	
	@GetMapping("/shopping-cart")
	public String CartPayment() {
		
		String url = "http://PAYMENT-SERVICE/payment-service/payNow/340";
		
		return template.getForObject(url, String.class);
	}
	
	

}
