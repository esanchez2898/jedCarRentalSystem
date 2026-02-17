package com.example.demo.Repository;

import com.example.demo.Entity.Car;
import lombok.Data;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface CarRepository extends JpaRepository<Car, Integer> {

    @Query(value="SELECT id, type, model, year, color, price_per_day FROM public.car WHERE id = :id", nativeQuery = true)
    public Car findById(int id);


}
