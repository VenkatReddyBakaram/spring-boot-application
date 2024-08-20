package com.vtech.service;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class MySQLDBConfig {

	@Value("${spring.app.driverName}")
	private String driverName;

	@Value("${spring.app.userName}")
	private String userName;

	@Value("${spring.app.password}")
	private String password;

	@Value("${spring.app.url}")
	private String url;

	public String getDriverName() {
		return driverName;
	}

	public String getUserName() {
		return userName;
	}

	public String getPassword() {
		return password;
	}

	public String getUrl() {
		return url;
	}
}