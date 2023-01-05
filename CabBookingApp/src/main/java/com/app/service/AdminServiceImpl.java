package com.app.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.exception.AdminException;
import com.app.exception.BookingException;
import com.app.model.Admin;
import com.app.model.Booking;
import com.app.repository.AdminRepository;
import com.app.repository.BookingRepository;

@Service
public class AdminServiceImpl implements AdminService{
	
	@Autowired
	private AdminRepository adminRepo;
	
	@Autowired
	private BookingRepository bookingRepo;
	
	

	@Override
	public Admin createAdmin(Admin admin) {
		// TODO Auto-generated method stub
		return adminRepo.saveAndFlush(admin);
	}

	@Override
	public Admin updateAdmin(Admin admin) throws AdminException {
		// TODO Auto-generated method stub
		Optional<Admin> opt = adminRepo.findById(admin.getAdminId());
		if(opt.isEmpty())
		{
			throw new AdminException("Admin is not present with the id: "+admin.getAdminId());
		}
		return adminRepo.saveAndFlush(admin);
	}

	@Override
	public Admin deleteAdmin(Integer adminId) throws AdminException {
		// TODO Auto-generated method stub
		Optional<Admin> opt = adminRepo.findById(adminId);
		if(opt.isEmpty())
		{
			throw new AdminException("Admin is not present with admin id: "+adminId);
		}
		adminRepo.deleteById(adminId);
		return opt.get();
	}

	@Override
	public Admin getAdminById(Integer adminId) throws AdminException {
		// TODO Auto-generated method stub
		Optional<Admin> opt = adminRepo.findById(adminId);
		if(opt.isEmpty())
		{
			throw new AdminException("Admin is not present with admin id: "+adminId);
		}
		return opt.get();
	}

	@Override
	public List<Booking> getAllBookings() throws BookingException {
		// TODO Auto-generated method stub
		List<Booking> bookings = bookingRepo.findAll();
		if(bookings.size() == 0)
		{
			throw new BookingException("No booking data is available");
		}
		return bookings;
	}

}
