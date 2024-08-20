package com.vtech.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.vtech.entities.Customer;

@Repository
public interface CustomerRepository extends JpaRepository<Customer, String> {

	List<Customer> findByCustomerEmail(String customerEmail);

	List<Customer> findByCustomerEmailAndCustomerName(String customerEmail, String customerName);

}
