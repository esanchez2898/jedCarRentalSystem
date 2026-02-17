package com.example.demo.Entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name="car")
public class Car {

    @Id
    @Column(name="id")
    private int id;
    @Column(name="type")
    private String type;
    @Column(name="model")
    private String model;
    @Column(name="year")
    private int year;
    @Column(name="color")
    private String color;
    @Column(name="price_per_day")
    private double pricePerDay;

}
