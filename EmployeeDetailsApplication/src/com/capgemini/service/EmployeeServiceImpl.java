package com.capgemini.service;
import com.capgemini.repo.EmployeeRepo;

import java.util.List;
import com.capgemini.beans.Employee;
import com.capgemini.beans.Address;

public class EmployeeServiceImpl implements EmployeeService {
	EmployeeRepo employeeRepo;
	
	public EmployeeServiceImpl(EmployeeRepo employeeRepo) {
		super();
		this.employeeRepo = employeeRepo;
	}

	@Override
	public boolean createEmployee(int id, String name, Address address) {
		Employee employee=new Employee();
		employee.setId(id);
		employee.setName(name);
		employee.setAddress(address);
		if(employeeRepo.save(employee)) {
			
		}
		return false;
			
	}

	@Override
	public List<Employee> searchByName(String name) {
		
		return employeeRepo.findByName(name);
	}
}
  
	  

