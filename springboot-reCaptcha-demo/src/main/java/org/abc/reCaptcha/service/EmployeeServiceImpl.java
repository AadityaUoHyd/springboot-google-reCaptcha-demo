package org.abc.reCaptcha.service;

import java.util.List;

import org.abc.reCaptcha.entity.Employee;
import org.abc.reCaptcha.repo.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmployeeServiceImpl implements IEmployeeService {
	@Autowired
	private EmployeeRepository repo;

	@Override
	public void createEmployee(Employee employee) {
		repo.save(employee);
	}
	
	@Override
	public List<Employee> getAllEmployees() {
		return repo.findAll();
	}

	
}