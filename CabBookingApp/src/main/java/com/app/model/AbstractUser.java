package com.app.model;

import com.app.Enum.ERole;

import jakarta.persistence.Embedded;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.MappedSuperclass;

@MappedSuperclass
public abstract class AbstractUser {
	
	private String username;
	private String password;
	
	@Embedded
	private Address address;
	
	private String mobileNumber;
	private String email;
	
	@Enumerated(EnumType.STRING)
	private ERole role;

}
