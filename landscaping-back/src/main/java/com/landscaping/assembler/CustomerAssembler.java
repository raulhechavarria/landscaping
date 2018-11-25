package com.landscaping.assembler;

import java.util.HashSet;
import java.util.Set;

import com.landscaping.entity.Customer;
import com.landscaping.entity.Yard;
import com.landscaping.rest.request.CustomerRequest;

public class CustomerAssembler {

	public static Customer customerRequest(CustomerRequest objRequest) {
		Customer customer = new Customer();
		customer.setId(objRequest.getId());
		customer.setLastName(objRequest.getLastName());
		customer.setPhone(objRequest.getPhone());
		customer.setName(objRequest.getName());
		Set<Yard> yards = new HashSet<>();
		objRequest.getYards().forEach(arg0 ->{
			Yard yard = new Yard();
			yard.setCity(arg0.getCity());
			yard.setDateDone(arg0.getDateDone());
			yard.setStreetandnumber(arg0.getStreetandnumber());
			yard.setFrequenceSummer(arg0.getFrequenceSummer());
			yard.setFrequenceWinter(arg0.getFrequenceWinter());
			yard.setCustomer(customer);
			yard.setId(arg0.getId());
			yards.add(yard);
		});
		customer.setYards(yards);
		return customer;
	}
}
