package com.packt.webstore.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.packt.webstore.domain.Employee;
import com.packt.webstore.repository.EmployeeRepository;
import com.packt.webstore.service.interfaces.EmployeeService;

@Service
@Transactional
public class EmployeeServiceImpl implements EmployeeService {
	
	@Autowired
	EmployeeRepository employeeRepository;
	
  	public List<Employee> getAll() {
		return  (List<Employee>) employeeRepository.findAll();
	}
	
	public Employee  save(Employee employee) {
		return employeeRepository.save(employee);
		
	}

	public Employee getByNumber(int number) {
		// TODO Auto-generated method stub
		return employeeRepository.getEmployeeByNumber(number);
	}
	
		   
}
 
