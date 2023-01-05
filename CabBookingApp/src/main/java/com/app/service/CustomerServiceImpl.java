package com.app.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.exception.CustomerException;
import com.app.model.Customer;
import com.app.repository.CustomerRepository;

@Service
public class CustomerServiceImpl implements CustomerService{
	
	@Autowired
	private CustomerRepository customerRepo;

	@Override
	public Customer addCustomer(Customer customer) {
		// TODO Auto-generated method stub
		return customerRepo.saveAndFlush(customer);
	}

	@Override
	public Customer updateCustomer(Customer customer) throws CustomerException {
		// TODO Auto-generated method stub
		Optional<Customer> opt = customerRepo.findById(customer.getCustomerId());
		if(opt.isEmpty())
		{
			throw new CustomerException("Customer is not availble with the id: "+customer.getCustomerId());
		}
		Customer updated = customerRepo.saveAndFlush(customer);
		return updated;
	}

	@Override
	public Customer deleteCustomer(Integer customerId) throws CustomerException {
		// TODO Auto-generated method stub
		Optional<Customer> opt = customerRepo.findById(customerId);
		if(opt.isEmpty())
		{
			throw new CustomerException("Customer is not availble with the id: "+customerId);
		}
		Customer deleted = opt.get();
		customerRepo.deleteById(customerId);
		return deleted;
	}

	@Override
	public Customer viewCustomerById(Integer customerId) throws CustomerException {
		// TODO Auto-generated method stub
		Optional<Customer> opt = customerRepo.findById(customerId);
		if(opt.isEmpty())
		{
			throw new CustomerException("Customer is not availble with the id: "+customerId);
		}
		Customer customer = opt.get();
		return customer;
	}

	@Override
	public List<Customer> viewCustomers() throws CustomerException {
		// TODO Auto-generated method stub
		List<Customer> customers = customerRepo.findAll();
		if(customers.size()==0)
		{
			throw new CustomerException("Customer list is empty !");
		}
		return customers;
	}

}
