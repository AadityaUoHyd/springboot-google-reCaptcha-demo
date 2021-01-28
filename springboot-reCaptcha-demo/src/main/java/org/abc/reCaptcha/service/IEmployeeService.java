package org.abc.reCaptcha.service;

import java.util.List;

import org.abc.reCaptcha.entity.Employee;

public interface IEmployeeService {
	
	void createEmployee(Employee employee);
	List<Employee> getAllEmployees();
}