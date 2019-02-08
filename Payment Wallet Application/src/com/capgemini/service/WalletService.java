package com.capgemini.service;

import java.math.BigDecimal;

import com.capgemini.beans.Customer;

public interface WalletService {
	public Customer createAccount(String name,String mobileNo,BigDecimal amount);
	public Customer showBalance(String mobileNo);
	public Customer fundTransfer(String sourcemobileNo,String targetmobileNo,BigDecimal amount);
	public Customer depositAmount(String mobileNo,BigDecimal amount);
	public Customer withdrawAmount(String mobileNo,BigDecimal amount);
	
}
