package com.vtech.service;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

import jakarta.inject.Named;

//@Component("i3")
@Component
@Named("i3")
@Primary
public class I3 implements I {

	@Override
	public void testI() {
		System.out.println("Response from testI() method - class I3");
	}
}
