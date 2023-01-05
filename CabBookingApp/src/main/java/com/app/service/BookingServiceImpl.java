package com.app.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.dto.BookingDto;
import com.app.exception.BookingException;
import com.app.exception.CustomerException;
import com.app.exception.DriverException;
import com.app.model.Booking;
import com.app.model.Customer;
import com.app.model.Driver;
import com.app.repository.BookingRepository;
import com.app.repository.CustomerRepository;
import com.app.repository.DriverRepository;

@Service
public class BookingServiceImpl implements BookingService{
	
	
	@Autowired
	private BookingRepository bookingRepo;
	
	@Autowired
	private DriverRepository driverRepo;
	
	@Autowired
	private CustomerRepository customerRepo;

	@Override
	public Booking addBooking(BookingDto booking,Integer customerId, Integer driverId) throws DriverException, CustomerException {
		// TODO Auto-generated method stub
		Booking nb = new Booking();
		Customer customer = customerRepo.findById(customerId).orElseThrow(() -> new CustomerException("Customer with id "+customerId+" does not exists.."));
		nb.setCustomerId(customerId);
		Driver dvr = driverRepo.findById(driverId).orElseThrow(() -> new DriverException("Driver with id "+driverId+" does not exists.."));
		nb.setDriver(dvr);
		nb.setFromLocation(booking.getFromLocation());
		nb.setToLocation(booking.getToLocation());
		nb.setFromDateTime(booking.getFromDateTime());
		nb.setToDateTime(booking.getToDateTime());
		nb.setStatus(false);
		nb.setDistanceInKm(booking.getDistanceInKm());
		nb.setBill(dvr.getCab().getPerKMrate() * booking.getDistanceInKm());
		
		return bookingRepo.saveAndFlush(nb);
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
