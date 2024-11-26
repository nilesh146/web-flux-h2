package com.ace.town.service;

import com.ace.town.entity.Product;
import reactor.core.publisher.Mono;

public interface ProductServiceImpl {

    public Mono<Product> getProduct( String productId) throws Exception;
}
