package com.example.restaurant.exception;

public class InvalidMenuItemException extends RuntimeException {

    public InvalidMenuItemException(String message) {
        super(message);
    }
}

