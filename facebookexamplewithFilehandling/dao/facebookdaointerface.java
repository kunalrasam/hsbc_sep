package com.first_java.dao;

import java.io.FileNotFoundException;
import java.util.List;
import java.util.Map;

import com.facebokutility.facebookException;
import com.first_java.fentity.facebookuser;

public interface facebookdaointerface {
	int createdaoprofile(facebookuser fb) throws Exception;
	facebookuser updatedaoprofile(facebookuser fb, int i)throws Exception;
	facebookuser viewdaoprofile(facebookuser fb) throws Exception;
	List<facebookuser> searchprofile(facebookuser fb) throws facebookException;
	Map<String, List<facebookuser>> daouserdetailhistory() throws Exception;
	int createdaoprofilefile(facebookuser fb) throws FileNotFoundException, Exception;
}
