package com.goodproducts.view;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import com.goodproducts.controller.controller;
import com.goodproducts.controller.controllerinterface;
import com.goodproducts.utility.controllerFactory;

public class view {

	public static void main(String[] args) throws Exception {
		
		//factory method to create object
		controllerinterface ci;
		ci=controllerFactory.createobject("admincontroller");
		
		System.out.println("welcome to the system");
		System.out.println("enter your choice");
		System.out.println("1.add items"
				+ "2.getitems");
		
		
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		
		int i=Integer.parseInt(br.readLine());
		
		//switch case to take input from user
		switch(i)
		{
		case 1:ci.addcontrolleritems();
		
		break;
			
		case 2:ci.gettopcontrolleritems();
		break;
		
		default:System.out.println("wrong choice");
		}

	}

}
