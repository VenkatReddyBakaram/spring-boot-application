package com.vtech.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.vtech.entities.Customer;
import com.vtech.service.CustomerService;

//@Controller
@RestController
@RequestMapping("/customer")
public class CustomerController {

	@Autowired
	private CustomerService customerService;

	@PostMapping("/saveCustomer")
	// @ResponseBody
	public Customer saveCustomer(@RequestBody Customer customer) {
		return customerService.saveCustomer(customer);
	}

	@GetMapping("/findAllCustomers")
	public List<Customer> findAllCustomers() {
		return customerService.findAllCustomers();
	}

	@GetMapping("/findCustomerById/{customerId}")
	public Optional<Customer> findCustomerById(@PathVariable String customerId) {
		return customerService.findCustomerById(customerId);
	}

	@PutMapping("/updateCustomer")
	public Customer updateCustomer(@RequestBody Customer customer) {
		return customerService.updateCustomer(customer.getCustomerId(), customer);
	}

	@DeleteMapping("/deleteCustomerById/{customerId}")
	public void deleteCustomerById(@PathVariable String customerId) {
		customerService.deleteCustomerById(customerId);
	}

	// @RequestMapping(value = "/findByCustomerEmail/{customerEmail}",method =
	// RequestMethod.GET)
	@GetMapping("/findByCustomerEmail/{customerEmail}")
	List<Customer> findByCustomerEmail(@PathVariable String customerEmail) {
		return customerService.findByCustomerEmail(customerEmail);
	}

	@GetMapping("/findByCustomerEmailAndCustomerName")
	List<Customer> findByCustomerEmailAndCustomerName(@RequestParam(name = "customerEmail") String customerEmail,
			@RequestParam(name = "customerName") String customerName) {
		return customerService.findByCustomerEmailAndCustomerName(customerEmail, customerName);
	}
}