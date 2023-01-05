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

import com.app.exception.BookingException;
import com.app.model.Booking;
import com.app.service.BookingService;

@RestController
@RequestMapping("/cab247.in/api/booking")
public class BookingController {
	
	
	@Autowired
	private BookingService bookingService;
	
	
	@PostMapping("/add")
	public ResponseEntity<Booking> addBookingHandler(@RequestBody Booking booking)
	{
		Booking added = bookingService.addBooking(booking);
		
		return new ResponseEntity<Booking>(added, HttpStatus.CREATED);
	}
	
	@PutMapping("/update")
	public ResponseEntity<Booking> updateBookingHandler(@RequestBody Booking booking) throws BookingException
	{
		Booking updated = bookingService.updateBooking(booking);
		
		return new ResponseEntity<Booking>(updated, HttpStatus.ACCEPTED);
	}
	
	@DeleteMapping("/delete/{bookingId}")
	public ResponseEntity<Booking> deleteBookingHandler(@PathVariable("bookingId") Integer bookingId) throws BookingException
	{
		Booking deleted = bookingService.deleteBooking(bookingId);
		
		return new ResponseEntity<Booking>(deleted, HttpStatus.ACCEPTED);
	}
	
	@GetMapping("/bill/{customerId}")
	public ResponseEntity<Float> calculateBillHandler(@PathVariable("customerId")  Integer customerId) throws BookingException
	{
		float bill = bookingService.calculateBill(customerId);
		
		return new ResponseEntity<Float>(bill, HttpStatus.ACCEPTED);
	}
	
	@GetMapping("/view/customer/{customerId}")
	public ResponseEntity<List<Booking>> viewBookingCustomerHandler(@PathVariable("customerId") Integer customerId) throws BookingException
	{
		List<Booking> bookings = bookingService.viewBookingCustomer(customerId);
		
		return new ResponseEntity<List<Booking>>(bookings, HttpStatus.ACCEPTED);
	}
	
	@GetMapping("/view/{bookingId}")
	public ResponseEntity<Booking> viewBookingHandler(@PathVariable("bookingId") Integer bookingId) throws BookingException
	{
		Booking booking = bookingService.viewBooking(bookingId);
		
		return new ResponseEntity<Booking>(booking, HttpStatus.ACCEPTED);
	}
	
	@GetMapping("/view")
	public ResponseEntity<List<Booking>> viewAllBookingsHandler() throws BookingException
	{
		List<Booking> bookings = bookingService.viewAllBookings();
		
		return new ResponseEntity<List<Booking>>(bookings, HttpStatus.ACCEPTED);
		
	}

}
