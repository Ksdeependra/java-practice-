package com.capgemini.takehome.dao;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import  com.capgemini.takehome.dao.IProductDAO;
import com.capgemini.takehome.exception.ProductIdInvalidException;
import com.capgemini.takehome.bean.Product;
import com.capgemini.takehome.util.CollectionUtil;

public class ProductDAO implements IProductDAO {
	CollectionUtil collectionutil;
	Product product;
	
	Map<Integer, Product> hmap=new HashMap<Integer, Product>();


	@Override
	public Product getProductdetails(int productCode) throws ProductIdInvalidException {
		product=collectionutil.getProducts().get(productCode);
		if(product==null)
			throw new ProductIdInvalidException();
		return product;
		
	}
      
	
	
	}
      
      
