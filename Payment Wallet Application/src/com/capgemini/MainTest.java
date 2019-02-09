package com.capgemini.junit;

import static org.junit.jupiter.api.Assertions.*;

import java.math.BigDecimal;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.capgemini.exception.NameNotNullException;
import com.capgemini.repo.WalletRepo;
import com.capgemini.repo.WalletRepoImpl;
import com.capgemini.service.WalletService;
import com.capgemini.service.WalletServiceImpl;

class MainTest {
	WalletRepo repo=new WalletRepoImpl();
	WalletService s=new WalletServiceImpl(repo);
	

	@Test(expected = com.capgemini.exception.NameNotNullException.class)
	public void whennameisnotPassedThrowException() throws NameNotNullException {
		
			s.createAccount("sushil", "9854121412", BigDecimal.valueOf(200));
			}

	@Test(expected = com.capgemini.exception.NameNotNullException.class)
	public void whennameisnotPassedThrowException() throws NameNotNullException {
		
			s.createAccount("sushil", "9854121412", BigDecimal.valueOf(200));
}