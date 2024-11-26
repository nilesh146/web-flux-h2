package com.ace.town.exception;

import com.ace.town.pojo.AppError;
import com.ace.town.util.Utilities;
import lombok.extern.log4j.Log4j2;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import reactor.core.publisher.Mono;

@RestControllerAdvice
@Log4j2
public class GlobalExceptionHandler {


    @ExceptionHandler(Exception.class)
    public Mono<ResponseEntity> genericExceptionhandler(Exception exception){
        log.error("App Error :",exception);

        AppError errorResponse =AppError.builder()
                .message(exception.getMessage())
                .status(HttpStatus.INTERNAL_SERVER_ERROR.toString())
                .timeStamp(Utilities.getTimestampDDMMYYY()).build();

         return Mono.just(ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(errorResponse));

    }
}
