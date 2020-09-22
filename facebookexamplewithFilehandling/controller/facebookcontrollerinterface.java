package com.first_java.controller;

import com.facebokutility.facebookException;

public interface facebookcontrollerinterface {
	
	void createprofile() throws Exception;
	void updateprofile() throws Exception;
	void viewprofile()throws Exception;
	void searchprofile() throws facebookException;
	void deleteprofile();
	void userdetailhistory() throws Exception;
	void createusingfile()throws Exception;

}
