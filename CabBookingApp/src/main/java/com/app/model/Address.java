package com.app.model;

import lombok.Data;

@Data
public class Address {
	
	
	private Integer AddressId;
	private String addressLine1;
	private String addressLine2;
	private String city;
	private String country;
	private String pincode;

}
