package com.example.microservices.ProductService;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProductController {
	
	@GetMapping("/home")
	public String home(){
		
		return "Welcome to home page";
		
	}
	@GetMapping("/product")
	public List<Product> showProductDetails(){
		
		
		Product p=new Product(1,"12","APPle",48000);
		Product p1=new Product(2,"23","Samsung",35000);
		Product p2=new Product(3,"45","MI",30000);
		Product p3=new Product(4,"167","OPPO",25000);
		
		List<Product> listOfProducts=Arrays.asList(p,p1,p2,p3);
		
		return listOfProducts;
		
	}

}
