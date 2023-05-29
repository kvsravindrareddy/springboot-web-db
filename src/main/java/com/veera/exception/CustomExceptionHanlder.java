package com.veera.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class CustomExceptionHanlder {

    @ExceptionHandler(BusinessException.class)
    public ResponseEntity<ErrorDetail> handleBusinessException(BusinessException e) {
        return new ResponseEntity<>(new ErrorDetail("601",e.getMsg()), HttpStatus.BAD_REQUEST);
    }
}