package com.capgemini.service;

import java.math.BigDecimal;


import com.capgemini.beans.Customer;
import com.capgemini.beans.Wallet;
import com.capgemini.exception.NameNotNullException;
import com.capgemini.repo.WalletRepo;

public class WalletServiceImpl implements WalletService{
	 WalletRepo walletrepo;

	public WalletServiceImpl(WalletRepo walletrepo) {
		super();
		this.walletrepo = walletrepo;
	}

	@Override
	public Customer createAccount(String name, String mobNo, BigDecimal amount) throws NameNotNullException
	{ 
		Wallet w=new Wallet();
		if(name=="")
			throw new NameNotNullException();
	w.setAmount(amount);
	Customer c=new Customer(name, mobNo, w);
		if(walletrepo.save(c))
		{
			return c;
		}
		return null;
		
	}
	

	@Override
	public Customer depositAmount(String mobNo, BigDecimal amount) {
		Customer c=walletrepo.findOne(mobNo);
		if(c!=null)
		{
			Wallet w=new Wallet();
			w.setAmount(amount.add(c.getWallet().getAmount()));
			c.setWallet(w);
			
		}
		return c;
	}

	@Override
	public Customer withdrawAmount(String mobNo, BigDecimal amount) {
		Customer c=walletrepo.findOne(mobNo);
		if(c!=null)
		{
			Wallet w=new Wallet();
			w.setAmount(c.getWallet().getAmount().subtract(amount));
			c.setWallet(w);
			return c;
		}
		return null;
	}
	@Override
	public Customer fundTransfer(String sourceMobNo,String targetMobNo,BigDecimal amount) {
		Customer c=walletrepo.findOne(sourceMobNo);
		Customer b=walletrepo.findOne(targetMobNo);
		if(c!=null && b!=null)
		{
			Wallet w1=new Wallet();
			Wallet w2=new Wallet();
			w1.setAmount(amount.add(b.getWallet().getAmount()));
			w2.setAmount(c.getWallet().getAmount().subtract(amount));
			c.setWallet(w2);
			b.setWallet(w1);
			return b;
			
		}
		
		return null;
		
	}
	@Override
	public Customer showBalance(String mobNo) {
		return walletrepo.findOne(mobNo);
		}
	

}
