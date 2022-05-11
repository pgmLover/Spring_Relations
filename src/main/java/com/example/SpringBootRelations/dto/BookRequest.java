package com.example.SpringBootRelations.dto;

import com.example.SpringBootRelations.entity.Book;
import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class BookRequest {
    private Book book;
}
