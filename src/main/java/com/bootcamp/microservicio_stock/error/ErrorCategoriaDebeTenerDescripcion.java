package com.bootcamp.microservicio_stock.error;

public class ErrorCategoriaDebeTenerDescripcion extends RuntimeException {

    public ErrorCategoriaDebeTenerDescripcion (String message) {
        super(message);
    }
}