package com.test.feignclient.interfaces;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.test.feignclient.model.Product;

@FeignClient(value="feignclient",url="http://localhost:7071/product-service")
public interface FeignInterface {
	
	@Autowired
	public static final Environment environment = null;

	@RequestMapping(method=RequestMethod.GET, value="/products")
	public List<Product> getProducts();

	

    @RequestMapping(method= RequestMethod.GET, 
    value= "/products-by-id/{id}", produces="application/json")
	public Product getProductsById(@PathVariable ("id") int id);

	

	@RequestMapping(method=RequestMethod.GET, 
	value="/products-by-category/{category}", produces="application/json")
	public List<Product> getProductsByCategory(@PathVariable ("category") String category);
	
//	public static final ENVIRONMENT ENVIRONMENT = null;
	
	@GetMapping
	@RequestMapping("/default")
	public static String env() {
		String port=environment.getProperty("server.port");
		return "Programming microservices @" + port;
	}
	
	
}
