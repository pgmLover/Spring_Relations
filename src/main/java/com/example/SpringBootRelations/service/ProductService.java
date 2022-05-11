package com.example.SpringBootRelations.service;

import com.example.SpringBootRelations.dto.BookRequest;
import com.example.SpringBootRelations.dto.BookResponse;
import com.example.SpringBootRelations.entity.Book;
import com.example.SpringBootRelations.entity.OrderResponse;
import com.example.SpringBootRelations.repository.AuthorRepository;
import com.example.SpringBootRelations.repository.BookRepository;
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

    @Autowired
    private BookRepository bookRepository;
    @Autowired
    private AuthorRepository authorRepository;

    public List<OrderResponse> getTransaction(){
        return customerRepository.getOrderResponse();
    }

    public Book saveBook(BookRequest bookRequest) {
        return (bookRepository.save(bookRequest.getBook()));
    }

    public List<BookResponse> getAllBooks() {
        return authorRepository.getProducts();
    }
}
