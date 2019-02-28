package com.capgemini.takehome.service;

import com.capgemini.takehome.bean.Product;
import com.capgemini.takehome.dao.IProductDAO;
import com.capgemini.takehome.exception.ProductIdInvalidException;

public class ProductService implements IProductService {
      IProductDAO iRepo;
      public ProductService(IProductDAO iRepo) {
    	  this.iRepo=iRepo;
      }
	@Override
	public Product getProductDetails(int productCode) throws ProductIdInvalidException {
		return iRepo.getProductdetails(productCode);
		
	}
      
      
	
}
