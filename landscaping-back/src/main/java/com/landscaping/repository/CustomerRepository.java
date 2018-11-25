package com.landscaping.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.landscaping.entity.Customer;

@Repository
public interface CustomerRepository extends CrudRepository<Customer, Long>{

	
}
