package com.tms.vendorusecases;

import com.tms.dao.VendorDao;
import com.tms.dao.VendorDaoImpl;
import com.tms.exceptions.TenderManagementSystemException;

public class VendorLogOut {
	
	public static void main(String[] args) {
		
		VendorDao dao = new VendorDaoImpl();
		
		try {
			String message = dao.vendorLogOut();
			System.out.println(message);
		} catch (TenderManagementSystemException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
