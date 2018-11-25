package com.landscaping.rest.request;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

public class YardRequest {
	
	private Long id;
	
	private String streetandnumber;
	
	private String city;
	
	private Integer frequenceSummer;
	
	private Integer frequenceWinter;
	
	private Date dateDone;
	
	private Set<CustomerRequest> customersRequests = new HashSet<>();
	
	public Integer getFrequenceSummer() {
		return frequenceSummer;
	}

	public void setFrequenceSummer(Integer frequenceSummer) {
		this.frequenceSummer = frequenceSummer == null ? 15 : frequenceSummer;
	}

	public Integer getFrequenceWinter() {
		return frequenceWinter;
	}

	public void setFrequenceWinter(Integer frequenceWinter) {
		this.frequenceWinter = frequenceWinter == null ? 20 : frequenceWinter;
	}

	public Date getDateDone() {
		return dateDone;
	}

	public void setDateDone(Date dateDone) {
		this.dateDone = dateDone == null ? new Date() : dateDone;
	}

	public Set<CustomerRequest> getCustomers() {
		return customersRequests;
	}

	public void setCustomers(Set<CustomerRequest> customers) {
		this.customersRequests = customers;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getStreetandnumber() {
		return streetandnumber;
	}

	public void setStreetandnumber(String streetandnumber) {
		this.streetandnumber = streetandnumber;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	

}
