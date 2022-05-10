package com.example.SpringBootRelations;

import com.example.SpringBootRelations.entity.Customer;
import com.example.SpringBootRelations.entity.Product;
import com.example.SpringBootRelations.repository.CustomerRepository;
import com.example.SpringBootRelations.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringBootRelationsApplication  {

	@Autowired
	private CustomerRepository customerRepository;

	@Autowired
	private ProductRepository itemRepository;

	public static void main(String[] args) {
		SpringApplication.run(SpringBootRelationsApplication.class, args);
	}

}
