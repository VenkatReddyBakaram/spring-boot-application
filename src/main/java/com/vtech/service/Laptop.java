package com.vtech.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import com.vtech.beans.CustomerBean;
import com.vtech.beans.EmployeeBean;

import jakarta.inject.Inject;

@Component(value = "laptopDell")
@Scope(scopeName = "prototype")
public class Laptop {

	@Autowired
	private MySQLDBConfig mySQLDBConfig;

	@Autowired
	private CustomerBean customerBean;

	@Autowired
	private EmployeeBean employeeBean;

	// @Autowired
	// @Qualifier("i3")
	// @Resource(name = "i3")
	// @Resource
	@Inject
	// @Named("i3")
	private I i;

	public Laptop() {
		super();
		System.out.println("Laptop is ready to serve.....!");
	}

	public void laptopDetails(String brand, String model, Double price) {

		System.out.println("Brand :" + brand);
		System.out.println("Model :" + model);
		System.out.println("Price :" + price);

		System.out.println(mySQLDBConfig.getDriverName());
		System.out.println(mySQLDBConfig.getUserName());
		System.out.println(mySQLDBConfig.getPassword());
		System.out.println(mySQLDBConfig.getUrl());

		customerBean.customerBean();
		employeeBean.employeeBean();

		i.testI();

	}
}
