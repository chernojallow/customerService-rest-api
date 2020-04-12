package com.galvanize.service;

import com.galvanize.entities.Customer;
import com.galvanize.entities.ServiceTicket;
import com.galvanize.repository.CustomerRepository;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.Optional;

@Service
public class CustomerService {


    CustomerRepository  customerRepository;

    public CustomerService(CustomerRepository customerRepository){
        this.customerRepository = customerRepository;
    }

    public Customer createCustomer(Customer customer) {
        return this.customerRepository.save(customer);
    }

//    public ServiceTicket createServiceTicket(String phoneNumber, String description, String problemDetails){
//        Optional<Customer> customer = customerRepository.findByTelephone(phoneNumber);
//        if(customer.isPresent()){
//            return createServiceTicket(customer.get(), description, problemDetails);
//        } else{
//            throw new RuntimeException("Customer with telephone " + phoneNumber +" not found");
//        }
//    }






}
