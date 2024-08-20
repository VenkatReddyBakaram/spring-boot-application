package com.vtech.service;

import org.springframework.stereotype.Component;

@Component
public class Address {

	public void printAddress(String pinCode, String state, String country) {
		System.out.println("Pincode :" + pinCode);
		System.out.println("State :" + state);
		System.out.println("Country :" + country);
	}
}
