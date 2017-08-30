package com.gi.springboot.model;

import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "address")
public class Address {

	private String street;
	private String apt;
	private String city;
	private String zipCode;
	
	public Address(){
		
	}

	public Address(String street, String apt, String city, String zipCode) {
		super();
		this.street = street;
		this.apt = apt;
		this.city = city;
		this.zipCode = zipCode;
	}

	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	public String getApt() {
		return apt;
	}

	public void setApt(String apt) {
		this.apt = apt;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getZipCode() {
		return zipCode;
	}

	public void setZipCode(String zipCode) {
		this.zipCode = zipCode;
	}
	
	
}
