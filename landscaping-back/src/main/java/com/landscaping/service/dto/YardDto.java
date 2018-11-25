package com.landscaping.service.dto;

import java.util.Date;
import com.landscaping.entity.Customer;

public class YardDto {
	
	private Long id;
	
	private String streetandnumber;
	
	private String city;
	
	private Integer frequenceSummer;
	
	private Integer frequenceWinter;
	
	private Date dateDone;
	
	private Customer customer;
	
	private String name;
	
	private String phone;
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public YardDto() {
		super();
		// TODO Auto-generated constructor stub
	}

	public YardDto(Long id, String streetandnumber, String city, Integer frequenceSummer, Integer frequenceWinter,
			Date dateDone, Customer customer) {
		super();
		this.id = id;
		this.streetandnumber = streetandnumber;
		this.city = city;
		this.frequenceSummer = frequenceSummer;
		this.frequenceWinter = frequenceWinter;
		this.dateDone = dateDone;
		this.customer = customer;
		this.name = customer.getName();
		this.phone = customer.getPhone();
	}

	public YardDto(Long id, String streetandnumber, String city, Integer frequenceSummer, Integer frequenceWinter,
			Date dateDone) {
		super();
		this.id = id;
		this.streetandnumber = streetandnumber;
		this.city = city;
		this.frequenceSummer = frequenceSummer;
		this.frequenceWinter = frequenceWinter;
		this.dateDone = dateDone;
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

	public Integer getFrequenceSummer() {
		return frequenceSummer;
	}

	public void setFrequenceSummer(Integer frequenceSummer) {
		this.frequenceSummer = frequenceSummer;
	}

	public Integer getFrequenceWinter() {
		return frequenceWinter;
	}

	public void setFrequenceWinter(Integer frequenceWinter) {
		this.frequenceWinter = frequenceWinter;
	}

	public Date getDateDone() {
		return dateDone;
	}

	public void setDateDone(Date dateDone) {
		this.dateDone = dateDone;
	}

	public Customer getCustomer() {
		return customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}
	
	

}
