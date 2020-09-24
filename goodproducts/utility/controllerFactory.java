package com.goodproducts.utility;

import com.goodproducts.controller.controller;
import com.goodproducts.controller.controllerinterface;



public class controllerFactory {
	
	private controllerFactory()
	{
		
	}
	public static controllerinterface createobject(String nn)
	{
		controllerinterface ci = null;
		if(nn.equals("admincontroller"))
		{
			ci=new controller();
		}
		
		return ci;
		
	}


}
