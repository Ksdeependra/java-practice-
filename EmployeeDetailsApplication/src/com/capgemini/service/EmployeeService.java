package com.capgemini.service;

import java.util.List;

import com.capgemini.beans.Address;
import com.capgemini.beans.Employee;

public interface EmployeeService {
	 boolean createEmployee(int id,String name,Address address);
	 List<Employee>searchByName(String name);

}
