package com.java.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.java.model.Customer;

public interface CustomerRepository extends JpaRepository<Customer, Integer> {

}
