package com.app.model;

import com.app.Enum.ERole;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Entity


@ToString
@Data
public class Driver extends AbstractUser{
	
	

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer driverId;
	
	private String licenceNo;
	
	private float ratings;
	
	@OneToOne
	private Cab cab;
	
	
	
	public Driver(int driverId, String licenceNo, Cab cab, float ratings,String username, String password, Address address, String mobileNumber, String email,ERole role) {
		super(username,password,address,mobileNumber,email,role);
		this.driverId = driverId;
		this.licenceNo = licenceNo;
		this.cab = cab;
		this.ratings = ratings;
	}



	public Driver() {
		super();
	}
	
	
}
