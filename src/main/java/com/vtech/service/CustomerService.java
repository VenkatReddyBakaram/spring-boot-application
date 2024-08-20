package com.vtech.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.vtech.entities.Customer;
import com.vtech.repository.CustomerRepository;

@Service
public class CustomerService {

	@Autowired
	private CustomerRepository customerRepository;

	public Customer saveCustomer(Customer customer) {
		return customerRepository.save(customer);
	}

	public List<Customer> findAllCustomers() {
		return customerRepository.findAll();
	}

	public Optional<Customer> findCustomerById(String customerId) {
		return customerRepository.findById(customerId);
	}

	/*
	 * public Customer updateCustomer(String customerId, Customer customer) {
	 * 
	 * Optional<Customer> existingCustomer =
	 * customerRepository.findById(customerId);
	 * 
	 * if (existingCustomer.isPresent()) {
	 * 
	 * Customer dbCustomer = existingCustomer.get();
	 * dbCustomer.setCustomerId(customerId);
	 * dbCustomer.setAddress(customer.getAddress());
	 * dbCustomer.setCustomerEmail(customer.getCustomerEmail());
	 * dbCustomer.setCustomerName(customer.getCustomerName());
	 * dbCustomer.setCustomerPhone(customer.getCustomerPhone());
	 * 
	 * return customerRepository.save(dbCustomer); } else { throw new
	 * RuntimeException("Sorry give customer id is not existing in our records..!");
	 * } }
	 */

	public Customer updateCustomer(String customerId, Customer customer) {
		customer.setCustomerId(customerId);
		return customerRepository.save(customer);
	}

	public void deleteCustomerById(String customerId) {
		customerRepository.deleteById(customerId);
	}

	public List<Customer> findByCustomerEmail(String customerEmail) {
		return customerRepository.findByCustomerEmail(customerEmail);
	}

	public List<Customer> findByCustomerEmailAndCustomerName(String customerEmail, String customerName) {
		return customerRepository.findByCustomerEmailAndCustomerName(customerEmail, customerName);
	}
}