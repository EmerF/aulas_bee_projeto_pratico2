package com.ambev.pratico2.controller.Exceptions;

public class BadRequestCustomException extends RuntimeException {

    public BadRequestCustomException(String message) {
        super(message);
    }
}
