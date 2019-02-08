package com.capgemini.repo;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.capgemini.beans.Customer;


public class WalletRepoImpl implements WalletRepo {
	Map<String,Customer> c1=new HashMap<>();

	@Override
	public boolean save(Customer customer) {
		String n=customer.getMobileNo();
		c1.put(n, customer);
		return true;
	}

	@Override
	public Customer findOne(String mobileNo) {
		if(c1.containsKey(mobileNo)) 
		{
			Customer c=c1.get(mobileNo);
			return c;
			

		}
		return null;
	}
}

	


