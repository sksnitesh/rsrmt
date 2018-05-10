package com.lue.controller;

import com.lue.model.Customers;
import com.lue.repository.CustomerRepository;
import com.lue.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * 
 */
@RestController
@RequestMapping("/api")
public class CustomersController {

    
    @Autowired
    CustomerService customerService;

    @GetMapping("/customers")
    public List<Customers> getAllCustomers() {
        return customerService.findAll();
    }
}
