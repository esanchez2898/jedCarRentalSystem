package com.example.demo.Controller;


import com.example.demo.Entity.Car;
import com.example.demo.Service.CarService;
import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Data
public class CarRentalController {

    private final CarService carService;

    @GetMapping(path = "/getCarById")
    public Car getCarById(@RequestParam(name = "carID") int carID){
        return carService.findById(carID);
    }



}
