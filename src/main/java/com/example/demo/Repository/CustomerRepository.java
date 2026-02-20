package com.example.demo.Repository;

import com.example.demo.Entity.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface CustomerRepository extends JpaRepository<Customer, Integer> {
    @Query(value="SELECT id, name, sex, age, licence FROM public.customer WHERE id = :id", nativeQuery = true)
    public Customer findCustomerById(int id);

}