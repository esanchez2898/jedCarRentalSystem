package com.example.demo.exception;

public class CarNotFoundException extends RuntimeException {

    public CarNotFoundException(int id) {
        super("Car with id " + id + " not found.");
    }

}
