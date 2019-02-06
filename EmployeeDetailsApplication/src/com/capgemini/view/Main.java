package com.capgemini.view;
import com.capgemini.beans.Address;
import com.capgemini.beans.City;
import com.capgemini.beans.Country;
import com.capgemini.repo.EmployeeRepo;
import com.capgemini.repo.EmployeeRepoImpl;
import com.capgemini.service.EmployeeService;
import com.capgemini.service.EmployeeServiceImpl;
public class Main {
	static EmployeeRepo emp1=new EmployeeRepoImpl();
	static EmployeeService emp2=new EmployeeServiceImpl(emp1);

	public static void main(String[] args) {
		City city=new City();
		city.setName("pune");
		Country country=new Country();
		country.setName("India");
		Address address=new Address();
		address.setAddressline("XYZ");
		System.out.println(emp2.createEmployee(101,"rahul",address));
		System.out.println(emp2.searchByName("rahul"));
		
		
		

	}

}
