package com.galvanize.controllers;

import com.galvanize.entities.Customer;
import com.galvanize.service.CustomerService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/services")
public class ServiceRequestController {
    final CustomerService customerService;

    public ServiceRequestController (CustomerService customerService){
        this.customerService = customerService;
    }


    @PostMapping("/customer")
    public  Customer createCustomer(@RequestBody Customer customer){
        return customerService.createCustomer(customer);

    }

}
