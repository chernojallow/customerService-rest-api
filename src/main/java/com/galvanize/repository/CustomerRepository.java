package com.galvanize.repository;

import com.galvanize.entities.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface CustomerRepository  extends JpaRepository<Customer, Long> {
//    Optional<Customer> findByTelephone(String telephone);




}
