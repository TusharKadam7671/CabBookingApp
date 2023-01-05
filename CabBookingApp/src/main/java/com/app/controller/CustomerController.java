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

import com.app.exception.CustomerException;
import com.app.model.Customer;
import com.app.service.CustomerService;

@RestController
@RequestMapping("/cab247.in/api/customer")
public class CustomerController {
	
	
	@Autowired
	private CustomerService customerService;
	
	
	
	@PostMapping("/add")
	public ResponseEntity<Customer> addCustomer(@RequestBody Customer customer)
	{
		Customer added = customerService.addCustomer(customer);
		
		return new ResponseEntity<Customer>(added, HttpStatus.CREATED);
	}
	
	@PutMapping("/update")
	public ResponseEntity<Customer> updateCustomer(@RequestBody Customer customer) throws CustomerException
	{
		Customer updated = customerService.updateCustomer(customer);
		
		return new ResponseEntity<Customer>(updated, HttpStatus.ACCEPTED);
	}
	
	@DeleteMapping("/delete/{customerId}")
	public ResponseEntity<Customer> deleteCustomer(@PathVariable("customerId") Integer customerId) throws CustomerException
	{
		Customer deleted = customerService.deleteCustomer(customerId);
		
		return new ResponseEntity<Customer>(deleted, HttpStatus.ACCEPTED);
	}
	
	@GetMapping("/view/{customerId}")
	public ResponseEntity<Customer> viewCustomerById(@PathVariable("customerId") Integer customerId) throws CustomerException
	{
		Customer customer = customerService.viewCustomerById(customerId);
		
		return new ResponseEntity<Customer>(customer, HttpStatus.ACCEPTED);
	}
	
	@GetMapping("/view")
	public ResponseEntity<List<Customer>> viewCustomers() throws CustomerException
	{
		List<Customer> customers = customerService.viewCustomers();
		
		return new ResponseEntity<List<Customer>>(customers, HttpStatus.ACCEPTED);
	}

}
