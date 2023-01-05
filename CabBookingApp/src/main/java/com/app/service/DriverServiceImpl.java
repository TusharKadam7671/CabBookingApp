package com.app.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.exception.DriverException;
import com.app.model.Driver;
import com.app.repository.DriverRepository;

@Service
public class DriverServiceImpl implements DriverService{
	
	
	@Autowired
	private DriverRepository driverRepo;
	
	

	@Override
	public Driver addDriver(Driver driver) {
		// TODO Auto-generated method stub
		return driverRepo.saveAndFlush(driver);
	}

	@Override
	public Driver updateDriver(Driver driver) throws DriverException {
		// TODO Auto-generated method stub
		Optional<Driver> opt = driverRepo.findById(driver.getDriverId());
		if(opt.isEmpty())
		{
			throw new DriverException("Driver is not present with this id: "+driver.getDriverId());
		}
		Driver  updated = driverRepo.saveAndFlush(driver);
		return updated;
	}

	@Override
	public Driver deleteDriver(Integer driverId) throws DriverException {
		// TODO Auto-generated method stub
		Optional<Driver> opt = driverRepo.findById(driverId);
		if(opt.isEmpty())
		{
			throw new DriverException("Driver is not present with this id: "+driverId);
		}
		Driver  driver = opt.get();
		
		driverRepo.deleteById(driverId);
		
		return driver;
	}

	@Override
	public Driver viewDriverById(Integer driverId) throws DriverException {
		// TODO Auto-generated method stub
		Optional<Driver> opt = driverRepo.findById(driverId);
		if(opt.isEmpty())
		{
			throw new DriverException("Driver is not present with this id: "+driverId);
		}
		Driver  driver = opt.get();
		
		return driver;
	}

	@Override
	public List<Driver> viewAllDrivers() throws DriverException {
		// TODO Auto-generated method stub
		List<Driver> drivers = driverRepo.findAll();
		if(drivers.size()==0)
		{
			throw new DriverException("Driver list is empty !");
		}
		return drivers;
	}

}
