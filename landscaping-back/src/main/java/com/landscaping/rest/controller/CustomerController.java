package com.landscaping.rest.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.landscaping.entity.Customer;
import com.landscaping.rest.request.CustomerRequest;
import com.landscaping.service.CustomerService;



@RestController
@CrossOrigin
@RequestMapping("/customer")
public class CustomerController {
	
	@Autowired
	CustomerService service;
	
	
	@GetMapping
	public @ResponseBody List<Customer> find(){
		return service.find();
	}
	
	@GetMapping("/{id}")
	public @ResponseBody Customer findByID(@PathVariable Long id){
		return service.findByID(id);
	}
	
	@PostMapping
	public @ResponseBody Customer save(@RequestBody CustomerRequest objRequest) {
		return service.save(objRequest);

	}

	@PutMapping
	public @ResponseBody Customer update(@RequestBody CustomerRequest objRequest) {
		return service.save(objRequest);

	}
	
	@DeleteMapping("/{id}")
	public @ResponseBody Boolean delete(@PathVariable Long id){
		return service.delete(id);
	}
	

}
