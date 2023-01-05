package com.app.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.exception.BookingException;
import com.app.model.Booking;
import com.app.repository.BookingRepository;

@Service
public class BookingServiceImpl implements BookingService{
	
	
	@Autowired
	private BookingRepository bookingRepo;

	@Override
	public Booking addBooking(Booking booking) {
		// TODO Auto-generated method stub
		return bookingRepo.saveAndFlush(booking);
	}

	@Override
	public Booking updateBooking(Booking booking) throws BookingException {
		// TODO Auto-generated method stub
		Optional<Booking> opt = bookingRepo.findById(booking.getBookingId());
		if(opt.isEmpty())
		{
			throw new BookingException("No booking available with the id: "+booking.getBookingId());
		}
		Booking updated = bookingRepo.saveAndFlush(booking);
		return updated;
	}

	@Override
	public Booking deleteBooking(Integer bookingId) throws BookingException {
		// TODO Auto-generated method stub
		Optional<Booking> opt = bookingRepo.findById(bookingId);
		if(opt.isEmpty())
		{
			throw new BookingException("No booking available with the id: "+bookingId);
		}
		Booking booking = opt.get();
		bookingRepo.deleteById(bookingId);
		return booking;
	}

	@Override
	public Float calculateBill(Integer customerId) throws BookingException {
		// TODO Auto-generated method stub
		List<Booking> bookings = this.viewBookingCustomer(customerId);
		Optional<Float> bill = bookings.stream().map(b->b.getBill()).reduce((a,b)->a+b);
		return bill.get();
	}

	@Override
	public List<Booking> viewBookingCustomer(Integer customerId) throws BookingException {
		// TODO Auto-generated method stub
		List<Booking> bookings = bookingRepo.findByCustomerId(customerId);
		if(bookings.size()==0)
		{
			throw new BookingException("Booking list is empty for this customer with id: "+customerId);
		}
		return bookings;
	}

	@Override
	public Booking viewBooking(Integer bookingId) throws BookingException {
		// TODO Auto-generated method stub
		Optional<Booking> opt = bookingRepo.findById(bookingId);
		if(opt.isEmpty())
		{
			throw new BookingException("Booking is not available with booking id: "+bookingId);
		}
		return opt.get();
	}

	@Override
	public List<Booking> viewAllBookings() throws BookingException {
		// TODO Auto-generated method stub
		List<Booking> bookings = bookingRepo.findAll();
		if(bookings.isEmpty())
		{
			throw new BookingException("Booking list is empty !");
		}
		return bookings;
	}

}
