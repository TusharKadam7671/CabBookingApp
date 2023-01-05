package com.app.service;

import java.util.List;

import com.app.exception.BookingException;
import com.app.model.Booking;

public interface BookingService {
	
	public Booking addBooking(Booking booking);
	
	public Booking updateBooking(Booking booking) throws BookingException;
	
	public Booking deleteBooking(Integer bookingId) throws BookingException;
	
	public Float calculateBill(Integer customerId) throws BookingException;
	
	public List<Booking> viewBookingCustomer(Integer customerId) throws BookingException;
	
	public Booking viewBooking(Integer bookingId) throws BookingException;
	
	public List<Booking> viewAllBookings() throws BookingException;

}
