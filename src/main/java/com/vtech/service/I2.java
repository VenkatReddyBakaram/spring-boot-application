package com.vtech.service;

import org.springframework.stereotype.Component;

import jakarta.inject.Named;

//@Component("i2")
@Component
@Named("i2")
public class I2 implements I {

	@Override
	public void testI() {
		System.out.println("Response from testI() method - class I2");
	}
}
