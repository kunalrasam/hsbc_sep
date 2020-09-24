package com.goodproducts.utility;

import com.goodproducts.controller.controller;
import com.goodproducts.controller.controllerinterface;
import com.goodproducts.service.productservice;
import com.goodproducts.service.serviceinterface;

public class serviceFactory {
	
	private serviceFactory()
	{
		
	}
	public static serviceinterface createobject(String nn)
	{
		serviceinterface si = null;
		if(nn.equals("adminservice"))
		{
			si=new productservice();
		}
		
		return si;
		
	}

}
