package com.landscaping.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.landscaping.assembler.CustomerAssembler;
import com.landscaping.entity.Customer;
import com.landscaping.repository.CustomerRepository;
import com.landscaping.rest.request.CustomerRequest;

@Service
public class CustomerServiceImpl implements CustomerService{
	
	@Autowired
	CustomerRepository repository;
	
	@Autowired
	YardService yardService;

	@Override
	public List<Customer> find() {
		// TODO Auto-generated method stub
		return (List<Customer>) repository.findAll();
	}

	@Override
	public Customer findByID(Long id) {
		try {
			Customer obj = repository.findById(id).get();
			return obj;
		} catch (NumberFormatException e) {
			e.getMessage();
		}
		return null;
	}

	@Override
	public Customer save(CustomerRequest objRequest) {
		try {
			if (objRequest.getId() != null) {
				yardService.deleteYardByCustomer(objRequest.getId());
			}
			Customer customer = CustomerAssembler.customerRequest(objRequest);			
			return  repository.save(customer);
		} catch (Exception e) {
			// TODO: handle exception
		}
		return null;
	}

	@Override
	public Boolean delete(Long id) {
		
		try {
			repository.deleteById(id);
			return true; 
		} catch (Exception e) {
			return false; 
		}
		
	}
	
}
