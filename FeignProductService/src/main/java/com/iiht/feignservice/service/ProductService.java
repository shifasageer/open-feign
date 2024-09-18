package com.iiht.feignservice.service;

import java.util.List;

import com.iiht.feignservice.model.Product;


public interface ProductService {

	List<Product> findAll();

	List<Product> findByCategory(String category);

	Product findById(int id);

}