package com.goodproducts.service;

import java.util.List;

import com.goodproducts.entity.fooditems;
import com.goodproducts.utility.productsException;

public interface serviceinterface {
	public int addserviceitems(fooditems fi) throws productsException;
	public List<fooditems> getserviceitmes();

}
