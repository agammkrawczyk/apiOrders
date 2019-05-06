package com.aga.krawczyk.api.controller;
import com.aga.krawczyk.api.model.Customer;

import com.aga.krawczyk.api.model.Item;
import com.aga.krawczyk.api.repository.CustomerRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@CrossOrigin
@RestController
@RequestMapping("/app/")
public class CustomerController {
    @Autowired
    private CustomerRepository customerRepository;

    public CustomerController(CustomerRepository customerRepository){
        this.customerRepository=customerRepository;
    }

    @GetMapping("customers")
    public List<Customer> getAllCustomers() {
        return customerRepository.findAll();
    }

    @PostMapping("customer")
    public Customer addCustomer(@RequestBody Customer customer) {
        return customerRepository.save( customer );
    }
}