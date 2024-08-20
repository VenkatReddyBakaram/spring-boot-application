package com.vtech.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class StudentService {

	@Autowired
	private Address address;

	public void printStudentDetails() {

		System.out.println("Student ID : 1234");
		System.out.println("Student Name : John");
		System.out.println("Student Email ID : John@gmail.com");

		address.printAddress("501506", "TS", "India");
	}
}
