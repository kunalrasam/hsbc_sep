package com.goodproducts.service;

import java.util.List;

import com.goodproducts.dao.daointerface;
import com.goodproducts.dao.productsdao;
import com.goodproducts.entity.fooditems;
import com.goodproducts.utility.daoFactory;
import com.goodproducts.utility.productsException;

public class productservice implements serviceinterface {

	private daointerface di;
	public productservice()
	{
		di=daoFactory.createobject("admindao");
	}
	@Override
	public int addserviceitems(fooditems fi) throws productsException {
		int i=0;
		
		try
		{
		 i=di.adddaoitems(fi);
		}
		catch(productsException pe)//here i am re throwing my error
		{
			throw new productsException();
		}
		return i;
	}

	@Override
	public List<fooditems> getserviceitmes() {
		
		return di.getdaoitems();
	}

}
