package com.example.SpringBootRelations.dto;

import com.example.SpringBootRelations.entity.Book;
import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class BookResponse {
    private int rId;
    private String rName;
    private String rAuthor;
    private String rPublish;
}
