package com.luv2code.ThymeleafCode1.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.luv2code.ThymeleafCode1.Entity.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Integer> {
	
	public List<Employee> findAllByOrderByLastNameAsc();
}
