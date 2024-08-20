package com.vtech.service;

import org.springframework.stereotype.Component;

import jakarta.inject.Named;

//@Component("i1")
@Component
@Named("i1")
public class I1 implements I {

	@Override
	public void testI() {
		System.out.println("Response from testI() method - class I1");
	}
}
