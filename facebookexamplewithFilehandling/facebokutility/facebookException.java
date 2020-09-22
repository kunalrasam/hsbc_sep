package com.facebokutility;

public class facebookException extends Exception {
	private String name;
	public facebookException(String name) {
		this.name=name;
	}
	
	public String uu()
	{
		String n=null;
		if(name.length()<3)
		{
			n="name cant be less than 3 letters";
		}
		return n;
	}

	@Override
	public String toString()
	{
		return "user not exist1";
		
	}
	
	
	

}
