package com.goodproducts.controller;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

import com.goodproducts.entity.fooditems;
import com.goodproducts.service.productservice;
import com.goodproducts.service.serviceinterface;
import com.goodproducts.utility.productsException;
import com.goodproducts.utility.serviceFactory;

public class controller implements controllerinterface {

	private serviceinterface si;
	public controller()
	{
		si=serviceFactory.createobject("adminservice");//factory method to create object
	}
	@Override
	public void addcontrolleritems()  {
		
		System.out.println("entering the data of fooditems");
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		String code = null;
		String name = null;
		String quantity = null;
		String vegeterian = null;
		
		//entering the data into fooditems table
		try
		{
		System.out.println("enter item code for product");
		 code=br.readLine();
		
		System.out.println("enter name for product");
		 name=br.readLine();
		
		System.out.println("enter quanity for product");
		 quantity=br.readLine();

		System.out.println("enter vegeterian yes for product");
		 vegeterian=br.readLine();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
		

		fooditems fi=new fooditems();
		
		fi.setitemcode(code);
		fi.setitemname(name);
		fi.setquantity(quantity);
		fi.setvegeterian(vegeterian);
		
		try
		{
		int i=si.addserviceitems(fi);
		if(i==1)
		{
			System.out.println("items have been added");
		}
		else
		{
			System.out.println("items have not been added");
		}
		}
		catch(productsException pe)//catching the exception here which was re thrown from dao
		{
			pe.printStackTrace();
		}
		
	}

	@Override
	public void gettopcontrolleritems() {
		
		
		//taking the data from dao layer in the form of list
		
		  List<fooditems> sortedlist;
		  sortedlist=new ArrayList<fooditems>();
		  sortedlist=si.getserviceitmes();
		  
		  
		  for(fooditems fi:sortedlist)//printing first three top of fooditems
		  {
			  System.out.println(fi.getitemcode());
			  System.out.println(fi.getitemname());
			  System.out.println(fi.getquantity());
			  System.out.println(fi.getvegeterian());
		  }
		  
	}
	
	
	// this method is used to add items in the appreal
	@Override
	public void addapparelcontrolleritems() 
	{
		
		
	}

	
}
