package com.app.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.app.exception.DriverException;
import com.app.model.Driver;
import com.app.service.DriverService;

@RestController
@RequestMapping("/cab247.in/api/driver")
public class DriverController {
	
	@Autowired
	private DriverService driverService;
	
	
	@PostMapping("/add")
	public ResponseEntity<Driver> addDriverHandler(@RequestBody Driver driver)
	{
		Driver added = driverService.addDriver(driver);
		
		return new ResponseEntity<Driver>(added, HttpStatus.ACCEPTED);
	}
	
	@PutMapping("/update")
	public ResponseEntity<Driver> updateDriverHandler(@RequestBody Driver driver) throws DriverException
	{
		Driver updated = driverService.updateDriver(driver);
		
		return new ResponseEntity<Driver>(updated, HttpStatus.CREATED);
	}
	
	@DeleteMapping("/delete/{driverId}")
	public ResponseEntity<Driver> deleteDriverHandler(@PathVariable("driverId") Integer driverId) throws DriverException
	{
		Driver deleted = driverService.deleteDriver(driverId);
		
		return new ResponseEntity<Driver>(deleted, HttpStatus.CREATED);
	}
	
	@GetMapping("/view/{driverId}")
	public ResponseEntity<Driver> viewDriverByIdHandler(@PathVariable("driverId") Integer driverId) throws DriverException
	{
		Driver driver = driverService.viewDriverById(driverId);
		
		return new ResponseEntity<Driver>(driver, HttpStatus.CREATED);
	}
	
	@GetMapping("/view")
	public ResponseEntity<List<Driver>> viewAllDriversHandler() throws DriverException
	{
		List<Driver> drivers = driverService.viewAllDrivers();
		
		return new ResponseEntity<List<Driver>>(drivers, HttpStatus.CREATED);
	}

}
