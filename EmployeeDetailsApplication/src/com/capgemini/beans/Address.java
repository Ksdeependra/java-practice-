package com.capgemini.beans;
import com.capgemini.beans.City;
import com.capgemini.beans.Country;
public class Address {
	private String addressline;
	private Country country;
	
	public String getAddressline() {
		return addressline;
	}
	public void setAddressline(String addressline) {
		this.addressline = addressline;
	}
	public Country getCountry() {
		return country;
	}
	public void setCountry(Country country) {
		this.country = country;
	}
	@Override
	public String toString() {
		return "Address [addressline=" + addressline + ", country=" + country + "]";
	
  }
}
