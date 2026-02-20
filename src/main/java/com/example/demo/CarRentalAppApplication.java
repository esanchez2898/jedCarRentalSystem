package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class CarRentalAppApplication {
// http://localhost:8080/getCarById?carID=1
	public static void main(String[] args) {
		SpringApplication.run(CarRentalAppApplication.class, args);
	}

}