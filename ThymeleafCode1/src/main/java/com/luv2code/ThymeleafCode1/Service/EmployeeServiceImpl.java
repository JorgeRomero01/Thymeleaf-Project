package com.luv2code.ThymeleafCode1.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.luv2code.ThymeleafCode1.dao.EmployeeRepository;

import com.luv2code.ThymeleafCode1.Entity.Employee;

@Service
public class EmployeeServiceImpl implements EmployeeService {

	private EmployeeRepository employeeRepository;
	
	@Autowired
	public EmployeeServiceImpl(EmployeeRepository theEmployeeRepository) {
		employeeRepository = theEmployeeRepository;
	}

	@Override
	public List<Employee> findAll() {
		return employeeRepository.findAllByOrderByLastNameAsc();
	}

	@Override
	public Employee findById(int theId) {
		Optional<Employee> result2 = employeeRepository.findById(theId);
		
		Employee theEmployee = null;
		
		if(result2.isPresent()) {
			theEmployee = result2.get();
		}
		else {
			throw new RuntimeException("Did not find employee id - " + theId);
		}
		return theEmployee;
	}

	@Override
	public void save(Employee theEmployee) {
		employeeRepository.save(theEmployee);
	}

	@Override
	public void delete(int theId) {
		employeeRepository.deleteById(theId);
	}

}
