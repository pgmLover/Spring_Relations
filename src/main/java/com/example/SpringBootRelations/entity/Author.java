package com.example.SpringBootRelations.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Getter
@Setter
@Entity
@NoArgsConstructor
@AllArgsConstructor
public class Author {

    @Id
    private  int aId;
    private  String aName;
    private  String aEmail;

    @OneToOne(mappedBy = "author")
    private Book book;


}
