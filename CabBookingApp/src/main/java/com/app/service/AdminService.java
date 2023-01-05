package com.app.service;


import java.util.List;

import com.app.exception.AdminException;
import com.app.exception.BookingException;
import com.app.model.Admin;
import com.app.model.Booking;

public interface AdminService {
	
	public Admin createAdmin(Admin admin);
	
	public Admin updateAdmin(Admin admin) throws AdminException;

	public Admin deleteAdmin(Integer adminId) throws AdminException;
	
	public Admin getAdminById(Integer adminId) throws AdminException;
	
	//booking related services
	
	public List<Booking> getAllBookings() throws BookingException;
}
