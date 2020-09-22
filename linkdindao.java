package com.linkdin.dao;

import java.util.ArrayList;
import java.util.List;

import lentity.linkdinuser;

public class linkdindao implements linkdindaointerface {

	List<linkdinuser>ll=new ArrayList();
	@Override
	public void createdaoprofile(linkdinuser lu) {
		
		ll.add(lu);
		
		for(linkdinuser fl:ll)
		{
			System.out.println(fl.getname());
			System.out.println(fl.getpassword());
			System.out.println(fl.email());
		}
		
	}

	@Override
	public void updatedaoprofile() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deletedaoprofile() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void searchdaoprofile(linkdinuser lu) {
		
		
		linkdinuser lmm=new linkdinuser();
		List<linkdinuser>ll=new ArrayList();
		lmm.setname("kunal");
		lmm.setpassword("123");
		lmm.setemail("rasam");
		ll.add(lmm);
		
		String name=lu.getname();
		
		

		for(linkdinuser fl:ll)
		{
			if(fl.getname().equals(name))
			{
				System.out.println("user found");
			}
		}
	
		
		
	}

}
