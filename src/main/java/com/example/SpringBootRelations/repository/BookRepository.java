package com.example.SpringBootRelations.repository;

import com.example.SpringBootRelations.entity.Book;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookRepository extends JpaRepository<Book,Integer> {

}
