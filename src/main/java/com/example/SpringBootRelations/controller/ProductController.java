package com.example.SpringBootRelations.controller;

import com.example.SpringBootRelations.dto.BookRequest;
import com.example.SpringBootRelations.dto.BookResponse;
import com.example.SpringBootRelations.dto.OrderRequest;
import com.example.SpringBootRelations.entity.Book;
import com.example.SpringBootRelations.entity.Customer;
import com.example.SpringBootRelations.entity.OrderResponse;
import com.example.SpringBootRelations.repository.CustomerRepository;
import com.example.SpringBootRelations.repository.ProductRepository;
import com.example.SpringBootRelations.service.ProductService;
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
    @Autowired
    private ProductService productService;

    @PostMapping("/placeOrder")
    public Customer orderPlaced(@RequestBody  OrderRequest orderRequest){
        return customerRepository.save(orderRequest.getCustomer());
    }

    @GetMapping("/findAllOrders")
    public List<Customer> findAll(){
       return customerRepository.findAll();
    }

    @GetMapping("/getInfo")
    public List<OrderResponse> findDetail(){
        return productService.getTransaction();
    }

//    @GetMapping("/books")
//    public List<BookResponse> allBooks(){
//        return productService.getAllBooks();
//    }

    @PostMapping("/books/add")
    public Book saveBook(@RequestBody BookRequest bookRequest){
        return productService.saveBook(bookRequest);
    }
 }
