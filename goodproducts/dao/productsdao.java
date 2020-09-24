package com.goodproducts.dao;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import com.goodproducts.entity.fooditems;
import com.goodproducts.utility.productsException;

public class productsdao implements daointerface {

	List<fooditems>fl;
	public productsdao()
	{
		fl=new ArrayList<fooditems>();//this array list will work as database as i am using while in view this can be used in other user input like get data
	}
	@Override
	public int adddaoitems(fooditems fi)throws productsException {
		int i=0;
		fl.add(fi);//taking data in form of object and aading to the list
		
		try
		{
		if(fl.size()>0)
		{
			
			i=1;
		}
		if(fl.size()<0)
		{
			
			throw new productsException();
		}
		
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		return i;
		
	}

	@Override
	public List<fooditems> getdaoitems() {
		
		  List<fooditems> sortedlist;
		  sortedlist=new ArrayList<fooditems>();
		  Comparator c = Collections.reverseOrder();//this will sort the list in descending order
	      Collections.sort(fl,c);
	      
	      int i=0;
	      for(fooditems fi:fl)
	      {
	    	  if(i<=2)//cause we want only top 3 result
	    	  {
	    	  sortedlist.add(fi);
	    	  i++;
	    	  }
	      }
	      return sortedlist;
	      
	      
	     
	}

}
