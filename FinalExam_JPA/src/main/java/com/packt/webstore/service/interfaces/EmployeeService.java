package com.packt.webstore.service.interfaces;

import java.util.List;

import com.packt.webstore.domain.Employee;


 public interface EmployeeService   {
	
	public List<Employee> getAll();
	
	public Employee save(Employee employee);
	
	public Employee getByNumber(int id);

}
 
