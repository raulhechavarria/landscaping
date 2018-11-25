package com.landscaping.service;

import java.util.List;

import com.landscaping.entity.Customer;
import com.landscaping.rest.request.CustomerRequest;

public interface CustomerService {

	List<Customer> find();

	Customer findByID(Long id);

	Customer save(CustomerRequest objRequest);

	Boolean delete(Long id);

}
