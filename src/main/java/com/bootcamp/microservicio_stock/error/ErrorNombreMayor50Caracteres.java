package com.bootcamp.microservicio_stock.error;

public class ErrorNombreMayor50Caracteres extends RuntimeException{

    public ErrorNombreMayor50Caracteres (String message) {
        super(message);
    }
}
