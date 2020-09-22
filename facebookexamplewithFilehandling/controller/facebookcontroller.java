package com.first_java.controller;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Collections;
import java.util.List;
import java.util.Map;

import com.facebokutility.ServiceFactory;
import com.facebokutility.SortBy_Name;
import com.facebokutility.facebookException;
import com.first_java.fentity.facebookuser;
import com.first_java.service.facebookservice;
import com.first_java.service.facebookserviceinterface;

public class facebookcontroller implements facebookcontrollerinterface{

	private facebookserviceinterface fs;
	
	public facebookcontroller()
	{
		fs=ServiceFactory.createobject("adminservice");
	}
	@Override
	public void createprofile()  {
		try
		{
		String name;
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		name=br.readLine();
		facebookuser fb=new facebookuser();
		fb.SetName(name);
		
		int i = 0;
		try {
			i = fs.createprofileservice(fb);
		} catch (Exception e) {
			
			e.printStackTrace();
		}
		if(i>0)
		{
		System.out.println("profile created");
		}
		else
		{
			System.out.println("profile not created");
		}
		}catch(IOException ie)
		{
			
		}
		
		// TODO Auto-generated method stub
		
	}

	@Override
	public void updateprofile()  {
		try {
		int i=0;
		System.out.println("enter user you want to search");
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		String name=br.readLine();
		
		facebookuser fb=new facebookuser();
		fb.SetName(name);
		
		
		facebookuser fbb = null;
		try {
			fbb = fs.updateprofileservice(fb,i);
		} catch (Exception e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
		if(fbb!=null) {
			System.out.println("Current User Information is below");
			System.out.println("Name is : "+fbb.getname());
			
		}
		else {
			System.out.println("User with Name : "+name+" not exist");
		}
		
		
		i=1;
		System.out.println("*******Enter what you want to Update*******");
		
		System.out.println("1.update name");
		
				
		int j=Integer.parseInt(br.readLine());
		
		
		switch(j)
		{
		case 1:System.out.println("enter new name you want to enter");
		 String newname;
		 newname=br.readLine();
		
		 fb.SetnewName(newname);
		 System.out.println("old name"+fb.getname());
			try {
				fbb=fs.updateprofileservice(fb,i);
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		 System.out.println("profile updated");
		 break;
		 
		default:System.out.println("wrong choice");
		}
		
		}catch(IOException ie)
		{
			
		}
		
		
				
	}

	@Override
	public void viewprofile() {
		
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		String name = null;
		try {
			name = br.readLine();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		facebookuser fb=new facebookuser();
		fb.SetName(name);
		
		
		facebookuser fbb = null;
		try {
			fbb = fs.viewprofileservice(fb);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("profile edited");
		if(fbb!=null) {
			System.out.println("User Information is below");
			System.out.println("Name is : "+fbb.getname());
			
		}
		else {
			System.out.println("User with Name : "+name+" not exist");
		}
		
		// TODO Auto-generated method stub
		
	}
	@Override
	public void searchprofile()  {
		
		
		
		System.out.println("Enter profile name you want to search");
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		String name = null;
		try {
			name = br.readLine();
			if(name.length()<3)
			{
				throw new facebookException(name);
			}
		} 
		catch(facebookException fe)
		{
			System.out.print(fe.uu());
		}
		catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		facebookuser fb=new facebookuser();
		fb.SetName(name);
		
		
		
		
		List<facebookuser> fl = null;
		try {
			fl = fs.searchprofileservice(fb);
		} 
		catch(facebookException fe)
		{
			fe.printStackTrace();
		}
		catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		
		Collections.sort(fl, new SortBy_Name());
		
		System.out.println(fl.size()+"  users found");
		
		for(facebookuser u:fl) {
			System.out.println("****************************************");
			System.out.println("Name is : "+u.getname());
			System.out.println("****************************************");
		}
		
		
		
		
	}
	@Override
	public void deleteprofile() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void userdetailhistory() throws Exception {
		
		
		
		///imp -> for sake of implimentation of hashmap i have hanged searchprofile code please rechange it
		Map<String,List<facebookuser>>uu=fs.serviceuserdetailhistory();

		List<facebookuser>  ll=uu.get("studentlist");
		
		for(facebookuser u:ll) {
			System.out.println("****************************************");
			System.out.println("Name is : "+u.getname());
			
			System.out.println("****************************************");
		}
		
		
      List<facebookuser>  ll1=uu.get("proflist");
		
		for(facebookuser u:ll) {
			System.out.println("****************************************");
			System.out.println("Name is : "+u.getname());
			
			System.out.println("****************************************");
		}
		
	}
	//This method uses system file as database
	@Override
	public void createusingfile() throws Exception {
		String name;
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("enter the name ");
		name=br.readLine();
		facebookuser fb=new facebookuser();
		fb.SetName(name);
		int i=0;
		i=fs.createserviceprofilefile(fb);
		
		
	}
	
}
