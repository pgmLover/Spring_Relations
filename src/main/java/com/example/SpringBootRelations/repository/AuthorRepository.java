package com.example.SpringBootRelations.repository;

import com.example.SpringBootRelations.dto.BookResponse;
import com.example.SpringBootRelations.entity.Author;
import jdk.dynalink.linker.LinkerServices;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface AuthorRepository extends JpaRepository<Author,Integer> {
//    @Query("SELECT new com.example.SpringBootRelations.dto.BookResponse(b.bId,b.bName,a.aName,b.bPublish) FROM Book b JOIN b.author a")
//    public List<BookResponse> getProducts();
}
