package com.example.demo.Controller;

import com.example.demo.Entity.Car;
import com.example.demo.Entity.Customer;
import com.example.demo.Service.CarService;
import com.example.demo.Service.CustomerService;
import com.example.demo.exception.CarNotFoundException;
import jakarta.websocket.server.PathParam;
import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@Data
public class CarRentalController {

    private final CarService carService;
    private final CustomerService customerService;

    @GetMapping(path = "/getCarById")
    public Car getCarById(@RequestParam(name = "carID") int carID){
        return carService.findCarById(carID);
    }

    @GetMapping(path = "/getAllCars")
    public List<Car> findAllCars(){
        return carService.findAllCars();
    }

    @PostMapping(path = "/addNewCar")
    public ResponseEntity<Car> createNewCar(@RequestBody Car car){
        carService.createNewCar(car);
        //return ResponseEntity.ok(car);
        return ResponseEntity.status(HttpStatus.CREATED).body(car);
    }



    @DeleteMapping(path = "/deleteCarById/{carID}")
    public ResponseEntity deleteCarById(@PathVariable(name = "carID") int carID) {
        try {
            carService.deleteCarById(carID);
            return ResponseEntity.status(HttpStatus.NO_CONTENT).build();
        } catch (CarNotFoundException exception) {
            return ResponseEntity.badRequest().body(exception.getMessage());
        }
    }






    @GetMapping(path = "/getCustomerById")
    public Customer getCustomerById(@RequestParam(name = "customerID") int customerID) {
        return customerService.findCustomerById(customerID);
    }

}