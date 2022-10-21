package com.java.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.java.model.Customer;
import com.java.repo.CustomerRepository;
import com.java.service.CustomerService;

@Service
public class CustomerServiceImpl implements CustomerService {

	@Autowired
	private CustomerRepository customerRepository;

	

	@Override
	public List<Customer> getCustomer() {
		// TODO Auto-generated method stub
		return customerRepository.findAll();
	}

}
