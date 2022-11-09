package com.tms.administratorusecases;

import java.util.List;

import com.tms.dao.AdministratorDao;
import com.tms.dao.AdministratorDaoImlp;
import com.tms.exceptions.TenderManagementSystemException;
import com.tms.model.Bid;
import com.tms.model.Vendor;

public class ViewAllBids {
	
	public static void main(String[] args) {
		
		AdministratorDao dao = new AdministratorDaoImlp();
		
		try {
			List<Bid> list = dao.viewAllBids();
			list.forEach(i -> System.out.println(list));
		} catch (TenderManagementSystemException e) {
			e.printStackTrace();
		}
	}

}
