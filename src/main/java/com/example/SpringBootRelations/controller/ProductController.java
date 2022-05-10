package com.example.SpringBootRelations.controller;

import com.example.SpringBootRelations.dto.OrderRequest;
import com.example.SpringBootRelations.entity.Customer;
import com.example.SpringBootRelations.repository.CustomerRepository;
import com.example.SpringBootRelations.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ProductController {
    @Autowired
    private ProductRepository productRepository;
    @Autowired
    private CustomerRepository customerRepository;

    @PostMapping("/placeOrder")
    public Customer orderPlaced(@RequestBody  OrderRequest orderRequest){
        return customerRepository.save(orderRequest.getCustomer());
    }

    @GetMapping("/findAllOrders")
    public List<Customer> findAll(){
       return customerRepository.findAll();
    }

    @GetMapping("/findDetails")
    public List<Customer> findDetail(){
        return customerRepository.findAll();
    }
}
