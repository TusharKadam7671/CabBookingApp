package com.app.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;
import lombok.ToString;

@Data
@ToString
public class Address {
	
	
//	@GeneratedValue(strategy = GenerationType.AUTO)
//	private Integer addressId;
	
	private String addressLine1;
	private String addressLine2;
	private String city;
	private String country;
	private String pincode;
	
	
	public Address(String addressLine1, String addressLine2, String city, String country,
			String pincode) {
		super();
		this.addressLine1 = addressLine1;
		this.addressLine2 = addressLine2;
		this.city = city;
		this.country = country;
		this.pincode = pincode;
	}


	public Address() {
		super();
	}




	

}
