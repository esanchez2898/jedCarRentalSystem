package com.example.demo.Entity;

import jakarta.persistence.Entity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.OffsetDateTime;
import java.util.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Payment {

    private int paymentId;
    private int customerId;
    private int cardId;
    private double amount;
    private OffsetDateTime paymentDate;
    private String paymentMethod;
    private String status;

}