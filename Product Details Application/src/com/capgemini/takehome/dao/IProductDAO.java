package com.capgemini.takehome.dao;

import com.capgemini.takehome.bean.Product;
import com.capgemini.takehome.exception.ProductIdInvalidException;

public interface IProductDAO {
         Product getProductdetails(int productCode) throws ProductIdInvalidException;

}
