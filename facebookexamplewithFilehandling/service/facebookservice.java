package com.first_java.service;

import java.io.FileNotFoundException;
import java.util.List;
import java.util.Map;

import com.facebokutility.ServiceFactory;
import com.facebokutility.facebookException;
import com.first_java.dao.facebookdao;
import com.first_java.dao.facebookdaointerface;
import com.first_java.fentity.facebookuser;

public class facebookservice implements facebookserviceinterface {

	private facebookdaointerface fd;
	
	
	
	public facebookservice()
	{
		fd=ServiceFactory.createobjectdao("admindao");
	}


	@Override
	public facebookuser updateprofileservice(facebookuser fb,int i)  {
		
		System.out.println("service profile EDITED");
		facebookuser fbb = null;
		try {
			fbb = fd.updatedaoprofile(fb,i);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return fbb;
		// TODO Auto-generated method stub
		
	}

	@Override
	public facebookuser viewprofileservice(facebookuser fb)  {
		
		System.out.println("service profile EDITED");
		facebookuser fbb = null;
		try {
			fbb = fd.viewdaoprofile(fb);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return fbb;
		// TODO Auto-generated method stub
		
	}


	@Override
	public int createprofileservice(facebookuser fb)  {
		
			System.out.println("service profile created");
			
			int i = 0;
			try {
				i = fd.createdaoprofile(fb);
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			return i;
			// TODO Auto-generated method stub
			
		}


	@Override
	public List<facebookuser> searchprofileservice(facebookuser fb) throws facebookException {
		
		
		return fd.searchprofile(fb);
		
		
	}


	@Override
	public Map<String, List<facebookuser>> serviceuserdetailhistory() throws Exception {
		
		return fd.daouserdetailhistory();
	}


	@Override
	public int createserviceprofilefile(facebookuser fb) throws Exception {
		
		return fd.createdaoprofilefile(fb);
	}
	}

	
	

