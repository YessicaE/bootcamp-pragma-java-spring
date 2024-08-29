package com.bootcamp.microservicio_stock.error;

public class ErrorDescripionMayor90Caracteres extends RuntimeException{

    public ErrorDescripionMayor90Caracteres(String message) {
        super(message);
    }
}
