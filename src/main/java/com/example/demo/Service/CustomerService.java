package com.example.demo.Service;

import com.example.demo.Entity.Customer;
import com.example.demo.Repository.CustomerRepository;
import lombok.Data;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@Data
@RequiredArgsConstructor
public class CustomerService {

    private final CustomerRepository customerRepository;

    public Customer findCustomerById(int id) {
        return customerRepository.findCustomerById(id);
    }

}