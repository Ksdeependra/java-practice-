package com.capgemini.takehome.ui;

import java.util.Scanner;

import com.capgemini.takehome.bean.Product;
import com.capgemini.takehome.dao.IProductDAO;
import com.capgemini.takehome.dao.ProductDAO;
import com.capgemini.takehome.exception.ProductIdInvalidException;
import com.capgemini.takehome.service.IProductService;
import com.capgemini.takehome.service.ProductService;

public class View {

	public static void main(String[] args) throws ProductIdInvalidException {
		IProductDAO iRepo=new ProductDAO();
		IProductService iService=new ProductService(iRepo);
		Scanner sc=new Scanner(System.in);
		
		while(true)
		{
			System.out.println("Choose Option");
			System.out.println("1.Genrate Bill By entering product code and Quantity");
			System.out.println("2.Exit");
			int choice=sc.nextInt();
			sc.nextLine();
			switch (choice)
			{
			case 1:
				System.out.println("Enter product code");
				int productCode=sc.nextInt();
				if(productCode<=999 ||  productCode>=10000)
				{
				System.out.println("Enter valid code");
				productCode=sc.nextInt();
				sc.nextLine();
				}
				System.out.println("Enter Quantity");
				int quantity=sc.nextInt();
				if(quantity<=0)
				{
					System.out.println("Enter correct Quantity");
				}
				Product product=iService.getProductDetails(productCode);
				int product_price=product.getProductPrice();
				int linetotal=product_price*quantity;
				System.out.println("lineTotal="+linetotal);
				
				break;
			case 2:System.exit(0);
			break;
			}
			
		}
		

	}

}
