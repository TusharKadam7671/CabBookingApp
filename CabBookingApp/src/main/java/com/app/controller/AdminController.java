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

import com.app.exception.AdminException;
import com.app.exception.BookingException;
import com.app.model.Admin;
import com.app.model.Booking;
import com.app.service.AdminService;

@RestController
@RequestMapping("/cab247.in/api/admin")
public class AdminController {
	
	@Autowired
	private AdminService adminService;
	
	
	//http://localhost:8888/cab247.in/api/admin/save
	@PostMapping("/save")
	public ResponseEntity<Admin> createAdminHandler(@RequestBody Admin admin)
	{
		Admin saved = adminService.createAdmin(admin);
		
		return new ResponseEntity<Admin>(saved, HttpStatus.CREATED);
	}

	@PutMapping("/update")
	public ResponseEntity<Admin> updateAdminHandler(@RequestBody Admin admin) throws AdminException
	{
		Admin updated = adminService.updateAdmin(admin);
		
		return new ResponseEntity<Admin>(updated, HttpStatus.ACCEPTED);
	}
	
	@DeleteMapping("/delete/{adminId}")
	public ResponseEntity<Admin> deleteAdminHandler(@PathVariable("adminId") Integer adminId) throws AdminException
	{
		Admin deleted = adminService.deleteAdmin(adminId);
		
		return new ResponseEntity<Admin>(deleted, HttpStatus.CREATED);
	}
	
	@GetMapping("/{adminId}")
	public ResponseEntity<Admin> getAdminByIdHandler(@PathVariable("adminId") Integer adminId) throws AdminException
	{
		Admin admin = adminService.getAdminById(adminId);
		
		return new ResponseEntity<Admin>(admin, HttpStatus.CREATED);
	}
	
	@GetMapping("/allBookings")
	public ResponseEntity<List<Booking>> getAllBookingsListHandler() throws BookingException
	{
		List<Booking> bookings = adminService.getAllBookings();
		
		return new ResponseEntity<List<Booking>>(bookings, HttpStatus.CREATED);
	}
}
