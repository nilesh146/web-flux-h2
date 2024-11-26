package com.ace.town.endpoint;

import com.ace.town.entity.Product;
import com.ace.town.service.ProductService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Mono;

@RestController
@RequiredArgsConstructor
public class ProductEndpoint {

    private final ProductService productService;

    @GetMapping("/product/{productid}")
    public Mono<Product> getProduct(@PathVariable("productid") String productid){


        //ResponseEntity<Product> res= ResponseEntity.ok());
        return productService.getProduct(productid);
    }

    @GetMapping("/test-error")
    public Mono<Object> testError() {
        return Mono.error(new RuntimeException("Intentional exception"));

    }


}
