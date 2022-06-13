package com.wipro.womenempowerment.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Ngo {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer id;
	
	private int registeredNumber;
	
	private String organisationName;
	
	private String inchargeName;
	
	private String adharcardNumber;
	
	private String city;
	
	private int pincode;
	
	public Ngo() {
		// TODO Auto-generated constructor stub
	}

	public Ngo(int registeredNumber, String organisationName, String inchargeName, String adharcardNumber, String city,
			int pincode) {
		this.registeredNumber = registeredNumber;
		this.organisationName = organisationName;
		this.inchargeName = inchargeName;
		this.adharcardNumber = adharcardNumber;
		this.city = city;
		this.pincode = pincode;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public int getRegisteredNumber() {
		return registeredNumber;
	}

	public void setRegisteredNumber(int registeredNumber) {
		this.registeredNumber = registeredNumber;
	}

	public String getOrganisationName() {
		return organisationName;
	}

	public void setOrganisationName(String organisationName) {
		this.organisationName = organisationName;
	}

	public String getInchargeName() {
		return inchargeName;
	}

	public void setInchargeName(String inchargeName) {
		this.inchargeName = inchargeName;
	}

	public String getAdharcardNumber() {
		return adharcardNumber;
	}

	public void setAdharcardNumber(String adharcardNumber) {
		this.adharcardNumber = adharcardNumber;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public int getPincode() {
		return pincode;
	}

	public void setPincode(int pincode) {
		this.pincode = pincode;
	}
	
	
	
	
	
	
	

}
