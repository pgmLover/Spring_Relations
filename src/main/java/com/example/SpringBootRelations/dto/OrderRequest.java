package com.example.SpringBootRelations.dto;

import com.example.SpringBootRelations.entity.Customer;
import lombok.*;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class OrderRequest {
    private Customer customer;
}
