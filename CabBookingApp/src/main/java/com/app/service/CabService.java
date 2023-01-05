package com.app.service;

import java.util.List;

import com.app.exception.CabException;
import com.app.model.Cab;

public interface CabService {
	
	public Cab addCab(Cab cab);
	public Cab updateCab(Cab cab) throws CabException;
	public Cab deleteCab(Integer cabId) throws CabException;
	public Cab viewCabById(Integer cabId) throws CabException;
	public List<Cab> viewAllCabList() throws CabException;
	public List<Cab> viewCabsByType(String cabType) throws CabException;

}
