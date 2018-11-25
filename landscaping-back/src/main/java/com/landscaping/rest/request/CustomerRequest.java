package com.landscaping.rest.request;

import java.util.HashSet;
import java.util.Set;

public class CustomerRequest {
	
	private Long id;

	private String name;

	private String lastName;
	
	private String phone;
	
    private Set<YardRequest> yardsRequest = new HashSet<>();
    
	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public Set<YardRequest> getYardsRequest() {
		return yardsRequest;
	}

	public void setYardsRequest(Set<YardRequest> yardsRequest) {
		this.yardsRequest = yardsRequest;
	}

	public Set<YardRequest> getYards() {
		return yardsRequest;
	}

	public void setYards(Set<YardRequest> yards) {
		this.yardsRequest = yards;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}


	
}
