package com.example.SpringBootRelations.repository;

import com.example.SpringBootRelations.entity.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepository extends JpaRepository<Customer,Integer> {
}
