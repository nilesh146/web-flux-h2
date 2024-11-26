/*
package com.ace.town.config;

import com.ace.town.pojo.AppError;
import com.ace.town.util.Utilities;
import org.springframework.boot.web.reactive.error.ErrorWebExceptionHandler;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.web.reactive.function.server.ServerResponse;
import reactor.core.publisher.Mono;

@Configuration
public class AppConfig {

    @Bean
    public ErrorWebExceptionHandler customExceptionHandler() {
        return (exchange, ex) -> {
            HttpStatus status = HttpStatus.BAD_REQUEST; // Customize status based on the exception
            AppError errorResponse =AppError.builder()
                    .message(ex.getMessage())
                    .status(HttpStatus.BAD_REQUEST.toString())
                    .timeStamp(Utilities.getTimestampDDMMYYY()).build();

            // Set the response headers and status
            exchange.getResponse().setStatusCode(HttpStatus.BAD_REQUEST);
            exchange.getResponse().getHeaders().setContentType(MediaType.APPLICATION_JSON);

            // Write the response body
            return exchange.getResponse()
                    .writeWith(Mono.just(exchange.getResponse()
                            .bufferFactory()
                            .wrap(errorResponse.toJson().getBytes())));
        };
    }
}
*/
