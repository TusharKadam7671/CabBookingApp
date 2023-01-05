package com.app.service;

import java.util.List;

import com.app.exception.DriverException;
import com.app.model.Driver;

public interface DriverService {
	
	public Driver addDriver(Driver driver);
	
	public Driver updateDriver(Driver driver) throws DriverException;
	
	public Driver deleteDriver(Integer driverId) throws DriverException;
	
	public Driver viewDriverById(Integer driverId) throws DriverException;
	
	public List<Driver> viewAllDrivers() throws DriverException;

}
