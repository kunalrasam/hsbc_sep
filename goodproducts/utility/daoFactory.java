package com.goodproducts.utility;

import com.goodproducts.dao.daointerface;
import com.goodproducts.dao.productsdao;
import com.goodproducts.service.productservice;
import com.goodproducts.service.serviceinterface;

public class daoFactory {
	
	private daoFactory()
	{
		
	}
	public static daointerface createobject(String nn)
	{
		daointerface si = null;
		if(nn.equals("admindao"))
		{
			si=new productsdao();
		}
		
		return si;
		
	}


}
