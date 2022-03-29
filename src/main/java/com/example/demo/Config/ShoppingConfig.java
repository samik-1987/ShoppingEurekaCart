package com.example.demo.Config;

import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

@Configuration
public class ShoppingConfig {
	
	@Bean
	@LoadBalanced
	public RestTemplate getTemplate() {
		
		return new RestTemplate();
	}
	

}