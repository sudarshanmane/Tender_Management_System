package com.tms.vendorusecases;

import java.util.List;

import com.tms.dao.AdministratorDao;
import com.tms.dao.AdministratorDaoImlp;
import com.tms.dao.VendorDao;
import com.tms.dao.VendorDaoImpl;
import com.tms.exceptions.TenderManagementSystemException;
import com.tms.model.Tender;
import com.tms.model.Vendor;

public class ViewAllTenders {
	
	public static void main(String[] args) {
		
		VendorDao dao = new VendorDaoImpl();
		
		try {
			List<Tender> list = dao.viewAllTenders();
			list.forEach(i -> System.out.println(list));
		} catch (TenderManagementSystemException e) {
			e.printStackTrace();
		}
	}

}
