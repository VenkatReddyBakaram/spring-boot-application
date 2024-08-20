package com.vtech.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Lazy;

import com.vtech.beans.CustomerBean;
import com.vtech.beans.EmployeeBean;

@Configuration
public class AppConfig {

	@Bean
	@Lazy
	CustomerBean getCustomerBean() {
		return new CustomerBean();
	}

	@Bean
	EmployeeBean getEmployeeBean() {
		return new EmployeeBean();
	}
}
