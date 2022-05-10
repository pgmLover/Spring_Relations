package com.example.SpringBootRelations.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Table(name ="Customer")
public class Customer {

    @Id
    @GeneratedValue
    private  int id;
    private  String name;
    private  String email;
    private  String gender;
    @OneToMany(targetEntity = Product.class,cascade = CascadeType.ALL)
    @JoinColumn(name = "fk",referencedColumnName = "id")
    private List<Product> products;
}
