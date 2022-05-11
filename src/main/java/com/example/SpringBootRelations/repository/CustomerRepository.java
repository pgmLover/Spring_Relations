package com.example.SpringBootRelations.repository;
import com.example.SpringBootRelations.entity.Customer;
import com.example.SpringBootRelations.entity.OrderResponse;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface CustomerRepository extends JpaRepository<Customer,Integer> {

    @Query("SELECT new com.example.SpringBootRelations.entity.OrderResponse(c.name , p.productName) FROM Customer c JOIN c.products p")
    public List<OrderResponse> getOrderResponse();

    }

