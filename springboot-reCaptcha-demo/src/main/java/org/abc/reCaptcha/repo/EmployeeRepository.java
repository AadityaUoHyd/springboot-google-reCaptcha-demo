package org.abc.reCaptcha.repo;


import org.abc.reCaptcha.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<Employee, Integer> {

}