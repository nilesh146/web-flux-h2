package com.ace.town.service;

import com.ace.town.entity.Product;
import com.ace.town.repository.ProductRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Mono;

@Service
@RequiredArgsConstructor
@Log4j2
public class ProductService implements ProductServiceImpl{

    private final ProductRepository productRepository;

    @Override
    public Mono<Product> getProduct(String productId) {

        return Mono.justOrEmpty(productRepository.findById(Long.parseLong(productId)))

                .flatMap(productMono -> {
                    return  productMono;
                })
                .onErrorMap(throwable -> new RuntimeException(throwable));
    }
}
