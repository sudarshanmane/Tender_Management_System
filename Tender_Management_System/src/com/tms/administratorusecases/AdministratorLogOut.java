package com.tms.administratorusecases;

import com.tms.dao.AdministratorDao;
import com.tms.dao.AdministratorDaoImlp;
import com.tms.exceptions.TenderManagementSystemException;

public class AdministratorLogOut {
	
	public static void main(String[] args) {
		
		AdministratorDao dao =  new AdministratorDaoImlp();
		
		try {
			String message = dao.administratorLogOut();
			System.out.println(message);
		} catch (TenderManagementSystemException e) {
			e.printStackTrace();
		}
		
	}

}
