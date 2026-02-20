package com.example.demo.Service;

import com.example.demo.Entity.Car;
import com.example.demo.Repository.CarRepository;
import com.example.demo.exception.CarNotFoundException;
import lombok.Data;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Data
@RequiredArgsConstructor
public class CarService {

    private final CarRepository carRepository;

    public Car findCarById(int id) {
        return carRepository.findCarById(id);
    }

    public List<Car> findAllCars() {
        return carRepository.findAllCars();
    }

    public Car createNewCar(Car car) {
        return carRepository.save(car);
    }

    public void deleteCarById(int id) {
        Car car = carRepository.findCarById(id);
        if (car != null) {
            carRepository.delete(car);
        } else {
            throw new CarNotFoundException(id);
        }
    }


}