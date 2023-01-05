package com.app.service;

import java.util.List;

import com.app.exception.CustomerException;
import com.app.model.Customer;

public interface CustomerService {
	
	public Customer addCustomer(Customer customer);
	
	public Customer updateCustomer(Customer customer) throws CustomerException;
	
	public Customer deleteCustomer(Integer customerId) throws CustomerException;
	
	public Customer viewCustomerById(Integer customerId) throws CustomerException;
	
	public List<Customer> viewCustomers() throws CustomerException;

}
