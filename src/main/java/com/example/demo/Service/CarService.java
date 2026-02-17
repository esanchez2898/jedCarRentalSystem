package com.example.demo.Service;

import com.example.demo.Entity.Car;
import com.example.demo.Repository.CarRepository;
import lombok.Data;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Data
@RequiredArgsConstructor
public class CarService {

    private final CarRepository carRepository;


    public Car findById(int id) {
        return carRepository.findById(id);
    }


}
