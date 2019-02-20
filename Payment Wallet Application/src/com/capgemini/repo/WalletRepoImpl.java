package com.capgemini.repo;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.capgemini.beans.Customer;
import java.sql.Connection;
import java.sql.Connection;
public class WalletRepoImpl implements WalletRepo {
	Map<String,Customer> c1=new HashMap<>();
	
	public boolean save(Customer customer) {
		
		String n=customer.getMobileNo();
		c1.put(n, customer);
		return true;
	}
	public Customer findOne(String mobileNo) {
		if(c1.containsKey(mobileNo)) 
		{
			Customer c=c1.get(mobileNo);
			return c;
			

		}
		return null;
	}
}

	


