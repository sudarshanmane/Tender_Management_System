package com.tms.dao;

import com.tms.exceptions.TenderManagementSystemException;

public interface AdministratorDao {

	public String administratorLogin(String email,String pasword) throws TenderManagementSystemException;
	
}
