package com.ambev.pratico2.exceptions;

public class CustomNotFoundException extends Throwable {
    public CustomNotFoundException(String message) {
        super(message);
    }
}