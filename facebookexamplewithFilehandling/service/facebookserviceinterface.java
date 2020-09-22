package com.first_java.service;

import java.io.FileNotFoundException;
import java.util.List;
import java.util.Map;

import com.facebokutility.facebookException;
import com.first_java.fentity.facebookuser;

public interface facebookserviceinterface {

		int createprofileservice(facebookuser fb) throws Exception;
		facebookuser updateprofileservice(facebookuser fb, int i) throws Exception;
		facebookuser viewprofileservice(facebookuser fb) throws Exception;
		//int createprofileservice(facebookuser fb);
		List<facebookuser> searchprofileservice(facebookuser fb) throws facebookException;
		Map<String, List<facebookuser>> serviceuserdetailhistory() throws Exception;
		int createserviceprofilefile(facebookuser fb) throws FileNotFoundException, Exception;
	
}
