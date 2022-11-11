package com.tms.administratorusecases;

import java.util.List;

import com.tms.dao.AdministratorDao;
import com.tms.dao.AdministratorDaoImlp;
import com.tms.exceptions.TenderManagementSystemException;
import com.tms.model.Vendor;

public class ViewAllVendors {
	
	public static void main(String[] args) {
		
		AdministratorDao dao = new AdministratorDaoImlp();
		
		try {
			List<Vendor> list = dao.viewAllVendors();
			list.forEach(i -> System.out.println(list));
		} catch (TenderManagementSystemException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
