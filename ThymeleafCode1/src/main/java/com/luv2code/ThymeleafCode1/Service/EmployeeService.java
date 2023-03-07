package com.luv2code.ThymeleafCode1.Service;

import java.util.List;

import com.luv2code.ThymeleafCode1.Entity.Employee;

public interface EmployeeService {
	
	public List<Employee> findAll();
	
	public Employee findById(int theId);
	
	public void save(Employee theEmployee);
	
	public void delete(int theId);
}
