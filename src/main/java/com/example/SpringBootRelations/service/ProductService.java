package com.example.SpringBootRelations.service;

import com.example.SpringBootRelations.entity.OrderResponse;
import com.example.SpringBootRelations.repository.CustomerRepository;
import com.example.SpringBootRelations.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {
    @Autowired
    private ProductRepository productRepository;
    @Autowired
    private CustomerRepository customerRepository;

    public List<OrderResponse> getTransaction(){
        return customerRepository.getOrderResponse();
    }

}
