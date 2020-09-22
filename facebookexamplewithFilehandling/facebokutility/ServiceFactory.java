package com.facebokutility;

import com.first_java.controller.facebookcontroller;
import com.first_java.controller.facebookcontrollerinterface;
import com.first_java.dao.facebookdao;
import com.first_java.dao.facebookdaointerface;
import com.first_java.fentity.facebookuser;
import com.first_java.service.facebookservice;
import com.first_java.service.facebookserviceinterface;

public class ServiceFactory {
	private ServiceFactory()
	{
		
	}
	
	public static facebookcontrollerinterface createobjectview(String nn)
	{
		facebookcontrollerinterface fc=null;
		if(nn.equals("admincontrol"))
		{
			fc=new facebookcontroller();
		}
		return fc;
		
	}
	public static facebookserviceinterface createobject(String nn)
	{
		
		facebookserviceinterface fi=null;
		if(nn.equals("adminservice"))
		{
			fi=new facebookservice();
		}
		return fi;
		
	}
	public static facebookdaointerface createobjectdao(String nn)
	{
		
		facebookdaointerface fd=null;
		if(nn.equals("admindao"))
		{
			fd=new facebookdao();
		}
		return fd;
		
	}

}
