package com.app.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.exception.CabException;
import com.app.model.Cab;
import com.app.repository.CabRepository;

@Service
public class CabServiceImpl implements CabService{
	
	@Autowired
	private CabRepository cabRepo;

	@Override
	public Cab addCab(Cab cab) {
		// TODO Auto-generated method stub
		return cabRepo.saveAndFlush(cab);
	}

	@Override
	public Cab updateCab(Cab cab) throws CabException {
		// TODO Auto-generated method stub
		Optional<Cab> opt = cabRepo.findById(cab.getCabId());
		if(opt.isEmpty())
		{
			throw new CabException("Cab is not available with id: "+cab.getCabId());
		}
		
		Cab updated = cabRepo.saveAndFlush(cab);
		return updated;
	}

	@Override
	public Cab deleteCab(Integer cabId) throws CabException {
		// TODO Auto-generated method stub
		Optional<Cab> opt = cabRepo.findById(cabId);
		if(opt.isEmpty())
		{
			throw new CabException("Cab is not available with id: "+cabId);
		}
		
		Cab cab = opt.get();
		cabRepo.deleteById(cabId);
		
		return cab;
	}

	@Override
	public Cab viewCabById(Integer cabId) throws CabException {
		// TODO Auto-generated method stub
		Optional<Cab> opt = cabRepo.findById(cabId);
		if(opt.isEmpty())
		{
			throw new CabException("Cab is not available with id: "+cabId);
		}
		
		Cab cab = opt.get();
		
		return cab;
	}

	@Override
	public List<Cab> viewAllCabList() throws CabException {
		// TODO Auto-generated method stub
		
		List<Cab> cabs = cabRepo.findAll();
		if(cabs.size()==0)
		{
			throw new CabException("Cab list is empty !");
		}
		return cabs;
	}

	@Override
	public List<Cab> viewCabsByType(String cabType) throws CabException {
		// TODO Auto-generated method stub
		List<Cab> cabs = cabRepo.findByCabType(cabType);
		
		if(cabs.size()==0)
		{
			throw new CabException("Cab list is empty !");
		}
		return cabs;
	}

}
