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
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.app.exception.CabException;
import com.app.model.Cab;
import com.app.service.CabService;

@RestController
@RequestMapping("/cab247.in/api/cab")
public class CabController {
	
	@Autowired
	private CabService cabService;
	
	@PostMapping("/add")
	public ResponseEntity<Cab> addCabHandler(@RequestBody Cab cab)
	{
		Cab added = cabService.addCab(cab);
		
		return new ResponseEntity<Cab>(added, HttpStatus.ACCEPTED);
	}
	
	@PutMapping("/update")
	public ResponseEntity<Cab> updateCabHandler(@RequestBody Cab cab) throws CabException
	{
		Cab updated = cabService.updateCab(cab);
		
		return new ResponseEntity<Cab>(updated, HttpStatus.CREATED);
	}
	
	@DeleteMapping("/delete/{cabId}")
	public ResponseEntity<Cab> deleteCabHandler(@PathVariable("cabId") Integer cabId) throws CabException
	{
		Cab deleted = cabService.deleteCab(cabId);
		
		return new ResponseEntity<Cab>(deleted, HttpStatus.CREATED);
	}
	
	@GetMapping("/view/{cabId}")
	public ResponseEntity<Cab> viewCabByCabIdHandler(@PathVariable("cabId") Integer cabId) throws CabException
	{
		Cab cab = cabService.viewCabById(cabId);
		
		return new ResponseEntity<Cab>(cab, HttpStatus.CREATED);
	}
	
	@GetMapping("/view")
	public ResponseEntity<List<Cab>> viewAllCabListHandler() throws CabException
	{
		List<Cab> cabs = cabService.viewAllCabList();
		
		return new ResponseEntity<List<Cab>>(cabs, HttpStatus.CREATED);
	}
	
	@GetMapping("/view/cabType")
	public ResponseEntity<List<Cab>> viewCabsByTypeHandler(@RequestParam String cabType) throws CabException
	{
		List<Cab> cabs = cabService.viewCabsByType(cabType);
		
		return new ResponseEntity<List<Cab>>(cabs, HttpStatus.CREATED);
	}

}
