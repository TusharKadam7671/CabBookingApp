package com.app.model;

import com.app.Enum.ERole;

import jakarta.persistence.Entity;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Entity



@ToString
@Data
public class Admin extends AbstractUser{
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer adminId;
	
	
	
	
	public Admin(int adminId, String username, String password, Address address, String mobileNumber, String email, ERole role) {
		super(username,password,address,mobileNumber,email,role);
		this.adminId = adminId;
	}




	public Admin() {
		super();
	}

}
