package com.example.demo.Entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.OffsetDateTime;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class RentedCars {

    private int carId;
    private int customerId;
    private OffsetDateTime pickupDate;
    private OffsetDateTime returnDate;
    private double totalCost;

}