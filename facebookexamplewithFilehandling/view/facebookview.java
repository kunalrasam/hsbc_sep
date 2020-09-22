package com.first_java.view;
import java.io.BufferedReader;
import java.io.InputStreamReader;

import com.first_java.controller.facebookcontrollerinterface;
import com.facebokutility.ServiceFactory;
import com.first_java.controller.facebookcontroller;

public class facebookview {

	public static void main(String[] args) {
		
		
		try {
		// TODO Auto-generated method stub
		
		
		System.out.println("+++++++welcome++++++++");
		System.out.println("enter which service you want to do");
		System.out.println("1.create profile"
				+ "2.update profile"
				+ "3.view profile"
				+ "4.search profile"
				+ "5.delete profile"
				+ "6.view allprofilehistory"
				+ "7.createwithfile");
		
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		
		int i=Integer.parseInt(br.readLine());
		
		facebookcontrollerinterface fi;
		
		fi=ServiceFactory.createobjectview("admincontrol");
		
		switch(i)
		{
		case 1:fi.createprofile();
			break;
		
		case 2:fi.updateprofile();
			break;
		
		case 3:fi.viewprofile();
			break;
			
		case 4:fi.searchprofile();
			break;
			
			
		case 5:fi.deleteprofile();
			break;
			
		case 6:fi.userdetailhistory();	
		break;
		
		case 7:fi.createusingfile();
		break;
		default:System.out.println("wrong choice");
		
		}
		
		}
		catch(Exception e)
		{
			System.out.println(e);
			
		}
		

	}

}
