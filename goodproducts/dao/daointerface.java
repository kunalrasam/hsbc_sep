package com.goodproducts.dao;

import java.util.List;

import com.goodproducts.entity.fooditems;
import com.goodproducts.utility.productsException;

public interface daointerface {
	public int adddaoitems(fooditems fi) throws productsException;
	public List<fooditems> getdaoitems();

}
