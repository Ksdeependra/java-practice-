package com.capgemini.beans;
import com.capgemini.beans.City;
import com.capgemini.beans.Country;
import com.capgemini.beans.Address;
public class Employee {
	private String name;
    private Address address;
	private int id;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public void setAddressLine(Address address2) {
		
		
	}
	@Override
	public String toString() {
		return "Employee [name=" + name + ", address=" + address + ", id=" + id + "]";
	}
	
}


