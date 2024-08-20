package com.vtech.service;

import org.springframework.stereotype.Service;

import com.vtech.dtos.AddressDTO;
import com.vtech.dtos.EmployeeDTO;

@Service
public class UserService {

	public String doLogin(String userName, String password) {

		if (userName.equals(password))
			return "success";
		else
			return "failure";
	}

	public EmployeeDTO getEmployeeInformation() {

		EmployeeDTO employeeDTO = new EmployeeDTO();
		employeeDTO.setEmpName("Scott");
		employeeDTO.setEmail("scott@gmail.com");
		employeeDTO.setPhoneNumber("99843859328");

		AddressDTO addressDTO = new AddressDTO();
		addressDTO.setCity("Hyderabad");
		addressDTO.setState("Telanagana");
		addressDTO.setCountry("India");
		addressDTO.setZipCode("5000078");

		employeeDTO.setAddress(addressDTO);

		return employeeDTO;
	}
}