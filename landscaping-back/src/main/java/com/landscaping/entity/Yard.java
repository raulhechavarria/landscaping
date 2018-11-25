package com.landscaping.entity;

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "yard")
public class Yard {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "id")
	private Long id;
	
	@Column(name = "streetandnumber")
	private String streetandnumber;
	
	@Column(name = "city")
	private String city;
	
	@Column(name = "frequencesummer")
	private Integer frequenceSummer;
	
	@Column(name = "frequencewinter")
	private Integer frequenceWinter;
	
	@Column(name = "datedone")
	private Date dateDone;
	
	//@JsonBackReference()
	@ManyToOne()
	@JoinColumn(name = "customer_id")	
	private Customer customer;
	
	
	
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

	public Customer getCustomer() {
		return customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
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
