package com.facebokutility;

import java.util.Comparator;

import com.first_java.fentity.facebookuser;

public class SortBy_Name implements Comparator<facebookuser>{

	@Override
	public int compare(facebookuser f1, facebookuser f2) {
		
		return f1.getname().compareTo(f2.getname());
		
	}

}
