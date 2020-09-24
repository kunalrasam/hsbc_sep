

//this class will used as pojo file  and used to share data through objects 

package com.goodproducts.entity;



public class fooditems {
	private String itemcode;
	private String itemname;
	private String unitprice;
	private String dateman;
	private String vegeterian;
	private String quantity;
	
	public String getitemcode()
	{
		return itemcode;
	}
	public String getitemname()
	{
		return itemname;
	}
	//public String getunitprice()
	//{
	//	return unitprice;
	//}
	//public String getdateman()
	//{
	///	return dateman;
	//}
	public String getvegeterian()
	{
		return vegeterian;
	}
	public String getquantity()
	{
		return quantity;
	}
	
	public void setitemcode(String itemcode)
	{
		this.itemcode=itemcode;
	}
	
	public void setitemname(String itemname)
	{
		this.itemname=itemname;
	}
	
	
	public void setvegeterian(String vegeterian)
	{
		this.vegeterian=vegeterian;
	}
	
	public void setquantity(String quantity)
	{
		this.quantity=quantity;
	}

}
