package com.ace.town.repository;

import com.ace.town.entity.Product;
import org.springframework.data.repository.reactive.ReactiveCrudRepository;

public interface ProductRepository extends ReactiveCrudRepository<Product,Long> {
}
