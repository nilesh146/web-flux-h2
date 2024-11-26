package com.ace.town.entity;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Column;
import org.springframework.data.relational.core.mapping.Table;
@Data
@Table("products")
public class Product {

    @Id
    @Column("id")
    private Long productId;

    @Column("name")
    private String name;

    @Column("description")
    private String description;

    @Column("price")
    private Double price ;

    @Column("stock")
    private Integer stock;

}
